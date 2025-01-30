package com.mandarinaSolutions.impresiones3d.converter;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply=true)
public class ArticuloDimensionesConverter implements AttributeConverter<Map<String,String>, String>{
	
	@Override
	public String convertToDatabaseColumn(Map<String,String> dbData) {
		return dbData.toString();
	}
	
	@Override
	public Map<String,String> convertToEntityAttribute(String attribute) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(
					attribute,
					new TypeReference<Map<String,String>>(){}
			);
		} catch (JsonMappingException e) {
			return Map.of("error",e.toString());
		} catch (JsonProcessingException e) {
			return Map.of("error",e.toString());
		}
	}
	
}
