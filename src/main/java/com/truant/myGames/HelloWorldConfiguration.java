package com.truant.myGames;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    record Person (String name, int age) {}
    record Address (String firstStreet, String city) {}
    @Bean
    public String name() {
        return "Raul";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Antonio", 20);
    }

    @Bean
    public String firstStreet() {
        return "Marivento";
    }

    @Bean
    public String city() {
        return "Mazatlan";
    }

    @Bean
    public Address address() {
        return new Address("Marivento", "Mazatlam");
    }
}
