package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.concurrent.Executor;

public class CreateAccount extends TelegraphMethod<Account>{
    @JsonProperty("name")
    private String name;

    public CreateAccount setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Account deserializeResponse(String answer) throws IOException {
        return OBJECT_MAPPER.readValue(answer, new TypeReference<Account>(){});
    }

}
