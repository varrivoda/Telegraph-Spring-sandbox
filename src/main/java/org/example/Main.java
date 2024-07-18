package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Account account = new CreateAccount().setName("Andrey").execute();
        System.out.println(account.getName() +", " + account.getApiKey());
    }
}