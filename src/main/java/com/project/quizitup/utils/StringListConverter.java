package com.project.quizitup.utils;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String>{
    
    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return null; // or return an empty string if you prefer
        }
        return String.join(":!:", attribute); // Convert list to comma-separated string
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null; // or return an empty list if you prefer
        }
        return Arrays.asList(dbData.split(":!:")); // Convert string back to list
    }

}
