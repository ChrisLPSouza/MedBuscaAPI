package br.com.rm97465.medbuscaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(enableDefaultTransactions = false)
public class MedBuscaAPIApplication {

    public static void main (String[] args) {
        SpringApplication.run(MedBuscaAPIApplication.class, args);

    }
}
