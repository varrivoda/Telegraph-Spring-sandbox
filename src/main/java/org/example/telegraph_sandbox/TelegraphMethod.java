package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public abstract class TelegraphMethod<T extends TelegraphObject> {
    @Autowired
    protected ObjectMapper OBJECT_MAPPER;

    @Autowired
    protected TelegraphExecutor executor = new TelegraphExecutor();

    public T execute() throws IOException {
        return executor.execute(this);
    }

    public abstract T deserializeResponse(String responseContent) throws IOException;
}
