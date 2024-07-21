package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.telegraph_sandbox.jsonutils.NodeTextSerializer;

@JsonSerialize(using = NodeTextSerializer.class)
@AllArgsConstructor
@NoArgsConstructor
public class NodeText extends Node {

    @Getter
    private String content;

    public NodeText setContent(String content) {
        this.content = content;
        return this;
    }
}
