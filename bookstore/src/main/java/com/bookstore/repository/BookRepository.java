package com.bookstore.repository;

import com.bookstore.domain.security.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
