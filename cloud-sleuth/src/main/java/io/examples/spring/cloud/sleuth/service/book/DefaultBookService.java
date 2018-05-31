package io.examples.spring.cloud.sleuth.service.book;

import io.examples.spring.cloud.sleuth.domain.Book;
import io.examples.spring.cloud.sleuth.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class DefaultBookService implements BookService {
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Book> findAll() {
        log.info("Find all books");
        return bookRepository.findAll();
    }
}
