package com.example.devoir.dao.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Book")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id_book;
    private String title ;
    private String publisher ;
    private String datePublication ;
    private double price ;
    private String resume ;

}
