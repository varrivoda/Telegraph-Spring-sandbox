package org.example.telegraph_sandbox.jsonutils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.example.telegraph_sandbox.Node;
import org.example.telegraph_sandbox.NodeText;

import java.io.IOException;

public class NodeTextSerializer extends StdSerializer<NodeText> {
    protected NodeTextSerializer() {
        super(NodeText.class);
    }

    @Override
    public void serialize(NodeText nodeText, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(nodeText.getContent());
    }
}
