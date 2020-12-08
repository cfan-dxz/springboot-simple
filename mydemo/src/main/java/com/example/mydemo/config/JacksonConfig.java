package com.example.mydemo.config;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class JacksonConfig {
    @Bean
    public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.indentOutput(true).dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter localTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter localDateTimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Map<Class<?>, JsonSerializer<?>> serializers = new HashMap<>();
        serializers.put(LocalDate.class, new LocalDateSerializer(localDateFormatter));
        serializers.put(LocalTime.class, new LocalTimeSerializer(localTimeFormatter));
        serializers.put(LocalDateTime.class, new LocalDateTimeSerializer(localDateTimeformatter));
        //serializers.put(DisplayedEnum.class, new DisplayedEnumSerializer());
        builder.serializersByType(serializers);
        Map<Class<?>, JsonDeserializer<?>> deserializers = new LinkedHashMap<>();
        deserializers.put(LocalDate.class, new LocalDateDeserializer(localDateFormatter));
        //deserializers.put(CheckSettingColumnEnum.class, new StringToDisplayedEnumDeserializer<>(CheckSettingColumnEnum.class));
        //deserializers.put(CheckSettingWorkAreaEnum.class, new StringToDisplayedEnumDeserializer<>(CheckSettingWorkAreaEnum.class));
        //deserializers.put(CheckSettingOperatorEnum.class, new StringToDisplayedEnumDeserializer<>(CheckSettingOperatorEnum.class));

        builder.deserializersByType(deserializers);
        return builder;
    }
}
