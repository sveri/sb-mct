package de.sveri.mct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import nz.net.ultraq.thymeleaf.LayoutDialect;

/**
 * Created by sveri on 27.08.2015.
 */
// combines the three below
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
  
    }
}
