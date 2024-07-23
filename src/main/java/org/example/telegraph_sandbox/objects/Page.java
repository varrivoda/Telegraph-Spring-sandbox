package org.example.telegraph_sandbox.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.example.telegraph_sandbox.Node;
import org.example.telegraph_sandbox.TelegraphObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Page implements TelegraphObject {
    @Getter @JsonProperty
    private String path; ///< Path to the page.
    @Getter @JsonProperty
    private String url; ///< URL of the page.
    @Getter @JsonProperty
    private String title; ///< Title of the page.
    @Getter @JsonProperty
    private String description; ///< Description of the page.
    @Getter @JsonProperty("author_name")
    private String authorName; ///< Optional. Name of the author.
    @Getter @JsonProperty("author_url")
    private String authorUrl; ///< Optional. URL for the author.
    @Getter @JsonProperty("image_url")
    private String imageUrl; ///< Optional. Image URL of the page.
    @Getter @JsonProperty
    private List<Node> content; ///< Optional. Content of the page.
    @Getter @JsonProperty("can_edit")
    private Boolean canEdit; ///< Optional. Only returned if access_token passed. True, if the target Telegraph account can edit the page.

    public String toString() {
        return "Page{" +
                "path='" + path + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorUrl='" + authorUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", content=" + content +
                ", canEdit=" + canEdit +
                '}';
    }
}
