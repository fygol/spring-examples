package io.examples.spring.cloud.sleuth.web.book;

import io.examples.spring.cloud.sleuth.domain.Book;
import io.examples.spring.cloud.sleuth.service.book.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class BookController {
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        log.info("Get all books");
        return bookService.findAll();
    }
}
