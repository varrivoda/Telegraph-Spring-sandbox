package org.example.telegraph_sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockObjectMapper {

    public Account readValue(String answer) {
        String[] split = answer.substring(1, answer.length() - 1).split("%s");
        return new Account(split[1], split[3]);
    }

    public <T extends TelegraphObject> String writeValueAsString(TelegraphMethod<T> object) {
        Map<String, String> fieldsMap = new HashMap<>();
        List.of(object.getClass()
                .getDeclaredFields())
                .forEach(f->{
                    if(f.isAnnotationPresent(JsonProperty.class)){
                        List.of(object.getClass().getMethods()).forEach(m->{
                            if(m.getName().equals("get"+f)){
                                try {
                                    fieldsMap.put(f.getName(), m.invoke(object, m.getParameters()).toString());
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                    }
                });
        StringBuilder result = new StringBuilder();
        result.append("{");
        fieldsMap.entrySet().forEach(e->{
            result.append("\""+e.getKey()+"\" : ");
            result.append("\""+e.getValue()+"\"");
        });
        result.append("}");
        return result.toString();
    }
}
