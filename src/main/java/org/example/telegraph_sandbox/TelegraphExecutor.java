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
//these properties are bad------------------------------------------------------->-------------------------------------------------------------------------------------------v-------------------------------------------------------vvvvvvvvvv------v
//        String responseContent = "{\"path\":\"My-title-07-21-4\",\"url\":\"https:\\/\\/telegra.ph\\/My-title-07-21-4\",\"title\":\"My title\",\"description\":\"\",\"author_name\":\"Random author\",\"content\":[\"My content\"],\"views\":0,\"can_edit\":true}";
        //String responseContent = "{\"path\":\"My-title-07-21-4\",\"url\":\"https:\\/\\/telegra.ph\\/My-title-07-21-4\",\"title\":\"My title\",\"description\":\"\",\"authorName\":\"Random author\",\"content\":[\"My content\"],\"canEdit\":true}";
        //thois is for Account "{\"name\":\"Andrey\", \"apiKey\":\"abcdefg123456\"}";
        //version 3 for Page
        String responseContent = "{\"ok\":true,\"result\":{\"path\":\"My-title-07-23-3\",\"url\":\"https:\\/\\/telegra.ph\\/My-title-07-23-3\",\"title\":\"My title\",\"description\":\"\",\"author_name\":\"Random author\",\"content\":[\"My content\"],\"views\":0,\"can_edit\":true}}";

        return method.deserializeResponse(responseContent);
    }
}
