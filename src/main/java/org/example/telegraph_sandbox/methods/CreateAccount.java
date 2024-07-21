package org.example.telegraph_sandbox.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.example.telegraph_sandbox.TelegraphMethod;
import org.example.telegraph_sandbox.objects.Account;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CreateAccount extends TelegraphMethod<Account> {
    @JsonProperty
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
