package io.examples.spring.cloud.sleuth.service.book;

import io.examples.spring.cloud.sleuth.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
