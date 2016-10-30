package com.nat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by francisatore on 10/29/16.
 */

@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
public class AmountApplication {

    public static void main(String[] args) {

       SpringApplication.run(AmountApplication.class, args);
    }
}