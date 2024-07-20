package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Account account = context.getBean(CreateAccount.class)
                .setName("Andrey")
                .execute();

        System.out.println(account.getName() +", " + account.getApiKey());
    }
}