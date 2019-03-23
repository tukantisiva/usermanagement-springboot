package com.codechallenge.spring.data.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codechallenge.spring.data.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
