package com.example.devoir.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BookDto {

    private String title ;
    private String publisher ;
    private String datePublication ;
    private double price ;
    private String resume ;
}
