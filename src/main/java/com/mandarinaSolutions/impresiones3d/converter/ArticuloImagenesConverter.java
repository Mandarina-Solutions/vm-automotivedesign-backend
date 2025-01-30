package com.mandarinaSolutions.impresiones3d.converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply=true)
public class ArticuloImagenesConverter implements AttributeConverter<List<String>, String>{
	
	@Override
	public String convertToDatabaseColumn(List<String> dbData) {
		return dbData.toString();
	}
	
	@Override
	public List<String> convertToEntityAttribute(String attribute) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(
					attribute,
					new TypeReference<List<String>>(){}
			);
		} catch (JsonMappingException e) {
			return List.of(e.toString());
		} catch (JsonProcessingException e) {
			return List.of(e.toString());
		}
	}
	
}
