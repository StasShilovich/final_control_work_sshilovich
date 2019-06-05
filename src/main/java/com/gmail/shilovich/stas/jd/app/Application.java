package com.gmail.shilovich.stas.jd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.gmail.shilovich.stas.jd",
        exclude = UserDetailsServiceAutoConfiguration.class)
@EntityScan("com.gmail.shilovich.stas.jd.repository.model")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
