package com.example.devoir.Service;

import com.example.devoir.dao.entities.Book;
import com.example.devoir.dao.repositories.BookRepository;
import com.example.devoir.dto.BookDto;
import com.example.devoir.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookManager implements BookService {

    @Autowired

    public BookRepository bookRepository;
    @Autowired

    public BookMapper bookMapper;
    @Override
    public BookDto getBookByTitle(String title) {
        Book book = bookRepository.findByTitle(title);
        if (book == null) {
            throw new RuntimeException("Book with title " + title + " not found.");
        }
        return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        Book savedBook = bookRepository.save(book);
        return bookMapper.fromBookToBookDto(savedBook);
    }
}