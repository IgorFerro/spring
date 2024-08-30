package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class is marked as a configuration class, meaning it contains
 * @Bean definitions that will be processed by the Spring container
 * to generate and manage Spring beans.
 */

@Configuration
public class ProjectConfig {

    /**
     * This method defines a bean that will be managed by the Spring container.
     * The @Bean annotation indicates that this method will return an object
     * that should be registered as a bean in the Spring application context.
     *
     * @return an instance of [YourBeanClass]
     */

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
