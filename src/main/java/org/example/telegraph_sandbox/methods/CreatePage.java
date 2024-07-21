package org.example.telegraph_sandbox.methods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.telegraph_sandbox.Node;
import org.example.telegraph_sandbox.TelegraphMethod;
import org.example.telegraph_sandbox.objects.Page;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@NoArgsConstructor
public class CreatePage extends TelegraphMethod<Page> {
    @Getter
    private static final String URL_PATH = "createPage";

    @Getter @JsonProperty
    private String accessToken; ///< Required. Access token of the Telegraph account.
    @Getter @JsonProperty
    private String title; ///< Required (1-256 characters). Page title.
    @Getter @JsonProperty
    private String authorName; ///< (0-128 characters) Default author name for new articles, displayed below the title.
    @Getter @JsonProperty
    private String authorUrl; ///< (0-512 characters) Default author link, opened when users clicks on the name below the title.
    @Getter @JsonProperty
    private List<Node> content; ///< Required (Up to 64KB). Content of the page.
    @Getter @JsonProperty
    private boolean returnContent; ///< If true, a content field will be returned in the Page object (see: Content format).

    public CreatePage setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public CreatePage setTitle(String title) {
        this.title = title;
        return this;
    }

    public CreatePage setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public CreatePage setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
        return this;
    }

    public CreatePage setReturnContent(Boolean rc){
        this.returnContent = rc;
        return this;
    }

    public CreatePage setContent(List<Node> content){
        this.content = content;
        return this;
    }


    public CreatePage(String accessToken, String title, List<Node> content) {
        this.accessToken = accessToken;
        this.title = title;
        this.content = content;
    }

    @Override
    public Page deserializeResponse(String answer) throws IOException {
        return OBJECT_MAPPER.readValue(answer, new TypeReference<Page>(){});
    }

}
