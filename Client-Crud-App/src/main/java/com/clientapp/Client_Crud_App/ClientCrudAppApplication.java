package com.clientapp.Client_Crud_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.clientapp.Client_Crud_App", "com.clientapp.services", "repository"})
@EnableJpaRepositories(basePackages = "repository")
public class ClientCrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientCrudAppApplication.class, args);
    }
}
