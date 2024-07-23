package org.example.telegraph_sandbox.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.telegraph_sandbox.TelegraphObject;
import org.springframework.stereotype.Component;

@Component
public class Account implements TelegraphObject {
    @JsonProperty
    private String name;
    @JsonProperty
    private String apiKey;

    public Account(String name, String apiKey) {
        this.name=name;
        this.apiKey = apiKey;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public String getApiKey() {
        return apiKey;
    }
}
