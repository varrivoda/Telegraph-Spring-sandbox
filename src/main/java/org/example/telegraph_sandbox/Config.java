package org.example.telegraph_sandbox;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.*;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages = {"org.example.telegraph_sandbox"})
public class Config {

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

}
