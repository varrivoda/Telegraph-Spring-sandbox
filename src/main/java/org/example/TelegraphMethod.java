package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public abstract class TelegraphMethod<T extends TelegraphObject> {

    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    //@Autowired
    TelegraphExecutor executor = new TelegraphExecutor();

    public T execute() throws IOException {
        return executor.execute(this);
    }

    public abstract T deserializeResponse(String responseContent) throws IOException;
}
