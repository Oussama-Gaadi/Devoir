package com.example.devoir.Service;

import com.example.devoir.dao.entities.Book;
import com.example.devoir.dto.BookDto;

public interface BookService {

    public BookDto getBookByTitle (String title);
    public BookDto saveBook (BookDto bookDto);
}
