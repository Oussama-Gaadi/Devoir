package com.example.devoir.dao.repositories;

import com.example.devoir.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

    public Book findByTitle (String title);

}
