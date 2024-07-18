package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account extends TelegraphObject{
    @JsonProperty("name")
    private String name;
    @JsonProperty("apiKey")
    private String apiKey;

    public Account(String name, String apiKey) {
        super();
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
