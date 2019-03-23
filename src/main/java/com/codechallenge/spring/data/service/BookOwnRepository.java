package com.codechallenge.spring.data.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.codechallenge.spring.data.domain.Book;

public interface BookOwnRepository extends Repository<Book,Long>{
	@Query(value="select author from Book b where b.author=?1")
	List<Book> findByName(String name);
	List<Book> findByNameAndAuthor(String name, String author);
}
