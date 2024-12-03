package com.project.quizitup.entity.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class IntListConverter implements AttributeConverter<List<Integer>, String> {

    private static final String DELIMITER = ",";

    @Override
    public String convertToDatabaseColumn(List<Integer> list) {
        return (list == null || list.isEmpty()) ? null : list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(DELIMITER));
    }

    @Override
    public List<Integer> convertToEntityAttribute(String dbData) {
        return (dbData == null || dbData.isEmpty()) ? new ArrayList<>() : Arrays.stream(dbData.split(DELIMITER))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
