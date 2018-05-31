package io.examples.spring.cloud.sleuth.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int year;
}
