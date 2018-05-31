package io.examples.spring.cloud.sleuth.repository;

import io.examples.spring.cloud.sleuth.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
