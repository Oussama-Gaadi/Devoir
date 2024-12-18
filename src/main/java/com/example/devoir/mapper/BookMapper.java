package com.example.devoir.mapper;

import com.example.devoir.dao.entities.Book;
import com.example.devoir.dto.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook (BookDto bookDto){
        return mapper.map(bookDto ,Book.class);
    }

    public BookDto fromBookToBookDto (Book book){
        return mapper.map(book , BookDto.class);
    }

}
