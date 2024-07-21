package org.example.telegraph_sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class NodeElement extends Node{
    @JsonProperty("tag")
    @Getter
    private String tag; ///< Name of the DOM element. Available tags: a, aside, b, blockquote, br, code, em, figcaption, figure, h3, h4, hr, i, iframe, img, li, ol, p, pre, s, strong, u, ul, video.
    @JsonProperty("attrs")
    @Getter
    private Map<String, String> attrs;
    @JsonProperty("children")
    @Getter
    private List<Node> children;


    public NodeElement setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public NodeElement setAttrs(Map<String, String> attrs) {
        this.attrs = attrs;
        return this;
    }

    public NodeElement setChildren(List<Node> children) {
        this.children = children;
        return this;
    }


}
