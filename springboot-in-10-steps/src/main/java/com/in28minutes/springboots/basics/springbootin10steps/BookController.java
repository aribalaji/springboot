package com.in28minutes.springboots.basics.springbootin10steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    public static final Logger LOGGER = LogManager.getLogger();

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("getAllBooks called.");
        }
        return Arrays.asList(
                new Book(1L, "My First Book", "Aribalaji"),
                new Book(2L, "My Second Book", "Ari")
        );
    }
}
