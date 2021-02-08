package com.mu.demo;

import com.mu.demo.Aspect.AppContext;

import com.mu.demo.Model.Circle;
import com.mu.demo.Model.Rectangle;
import com.mu.demo.Observer.Parametrage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamenApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExamenApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Circle circle, Rectangle rectangle, Parametrage parametrage){
        return args -> {
            circle.surface();
            rectangle.piremiter();
            parametrage.add(circle);
            parametrage.add(rectangle);

        };
    }
}
