package ru.yuhimenko.MySecondTestAppSpringBoot.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class SystemNameDeserializer extends JsonDeserializer<Systems> {
    @Override
    public Systems deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String systemName = jsonParser.getText();
        return Systems.getSystemsFromName(systemName);
    }
}
