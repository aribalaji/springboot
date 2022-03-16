package com.in28minutes.springboots.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1L, "My First Book", "Aribalaji"),
                new Book(2L, "My Second Book", "Ari")
        );
    }
}
