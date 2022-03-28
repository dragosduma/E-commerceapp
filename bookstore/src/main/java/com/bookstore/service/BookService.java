package com.bookstore.service;


import com.bookstore.domain.security.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(Long id);
}
