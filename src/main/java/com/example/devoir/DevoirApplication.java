package com.example.devoir;

import com.example.devoir.Service.BookService;
import com.example.devoir.dao.repositories.BookRepository;
import com.example.devoir.dto.BookDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevoirApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            BookDto bookDto = BookDto.builder()
                    .title("Spring Boot Essentials")
                    .publisher("TechPress")
                    .datePublication("2024-12-01")
                    .price(49.99)
                    .resume("An essential guide to Spring Boot.")
                    .build();

            BookDto savedBook = bookService.saveBook(bookDto);
        };
    }

}
