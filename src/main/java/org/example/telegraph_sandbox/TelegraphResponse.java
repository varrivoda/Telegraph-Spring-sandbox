package org.example.telegraph_sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TelegraphResponse<T> implements Serializable {

    @JsonProperty
    private Boolean ok;
    @JsonProperty
    private String error;
    @JsonProperty
    private T result;

    public Boolean getOk() {
        return ok;
    }

    public String getError() {
        return error;
    }

    public T getResult() {
        return result;
    }

}