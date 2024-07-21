package org.example.telegraph_sandbox;

import org.example.telegraph_sandbox.methods.CreateAccount;
import org.example.telegraph_sandbox.methods.CreatePage;
import org.example.telegraph_sandbox.objects.Account;
import org.example.telegraph_sandbox.objects.Page;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

//        Account account = context.getBean(CreateAccount.class).setName("Andrey").execute();

        List<Node> content = List.of(new NodeText("My content"));
        Page page = context.getBean(CreatePage.class, "qwerty12354", "My title", content)
                .setAuthorName("Random author")
                .setReturnContent(true)
                .execute();

        System.out.println(page.toString());
    }
}