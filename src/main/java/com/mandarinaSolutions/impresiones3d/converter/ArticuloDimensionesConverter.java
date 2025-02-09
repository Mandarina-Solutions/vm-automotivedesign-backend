package com.mandarinaSolutions.impresiones3d.converter;

import java.util.Map;
import java.util.stream.Collectors;

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
//		"{\"small\": \"100x100x100\", \"medium\": \"200x200x200\"}"
		String jsonLikeString = dbData.entrySet().stream()
	            .map(entry -> "\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"")
	            .collect(Collectors.joining(", ", "{", "}"));
		return jsonLikeString;
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
