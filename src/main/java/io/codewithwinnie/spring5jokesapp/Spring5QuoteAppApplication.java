package io.codewithwinnie.spring5jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring5QuoteAppApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(Spring5QuoteAppApplication.class, args);
    }
    
    @Bean
    public ChuckNorrisQuotes getChuckNorisQuotes() {
        return new ChuckNorrisQuotes();
    }
    
}
