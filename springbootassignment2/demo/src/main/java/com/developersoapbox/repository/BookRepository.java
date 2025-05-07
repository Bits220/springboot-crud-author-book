package com.developersoapbox.repository;

import com.developersoapbox.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b JOIN b.author a")
    List<Book> findAllBooksWithAuthors();
}
