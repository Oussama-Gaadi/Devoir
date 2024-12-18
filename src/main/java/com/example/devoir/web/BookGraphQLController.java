package com.example.devoir.web;

import com.example.devoir.Service.BookService;
import com.example.devoir.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookGraphQLController {
    private final BookService bookService;

    @Autowired
    public BookGraphQLController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping
    public BookDto getBookByTitle(@Argument String title) {
        return bookService.getBookByTitle(title);
    }

    @MutationMapping
    public BookDto saveBook(@Argument String title , @Argument String publisher , @Argument String datePublication ,@Argument double price ,@Argument String resume ) {

        BookDto bookDto = BookDto.builder()
                .title(title)
                .publisher(publisher)
                .datePublication(datePublication)
                .price(price)
                .resume(resume)
                .build();
        return bookService.saveBook(bookDto);




    }

}
