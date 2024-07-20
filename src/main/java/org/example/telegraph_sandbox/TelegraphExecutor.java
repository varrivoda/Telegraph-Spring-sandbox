package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TelegraphExecutor {

    @Autowired
    private ObjectMapper objectMapper;

    public <T extends TelegraphObject> T execute(TelegraphMethod<T> method) throws IOException {
        objectMapper.writeValueAsString(method);
        //HTTP REQUEST...
        //MOCK RESPONSE:
        String responseContent = "{\"name\":\"Andrey\", \"apiKey\":\"abcdefg123456\"}";

        return method.deserializeResponse(responseContent);
    }
}
