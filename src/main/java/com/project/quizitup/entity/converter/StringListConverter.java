package com.project.quizitup.entity.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {
    
    private static final String DELIMITER = ",!,";

    @Override
    public String convertToDatabaseColumn(List<String> list) {
        return (list == null || list.isEmpty()) ? null : String.join(DELIMITER, list);
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        return (dbData == null || dbData.isEmpty()) ? new ArrayList<>() : Arrays.asList(dbData.split(DELIMITER));
    }
}
