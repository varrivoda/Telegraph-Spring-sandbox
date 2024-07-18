package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TelegraphExecutor {
    //@Autowired
    ObjectMapper objectMapper = new ObjectMapper();

    public <T extends TelegraphObject> T execute(TelegraphMethod<T> method) throws IOException {
        objectMapper.writeValueAsString(method);
        //HTTP REQUEST...
        String responseContent = "{\"name\":\"Andrey\", \"apiKey\":\"abcdefg123456\"}";

        return method.deserializeResponse(responseContent);
    }
}
