package com.developersoapbox.service;

import com.developersoapbox.entity.Book;
import com.developersoapbox.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAllBooksWithAuthors();
    }

    public void saveBook(Book book) {
        bookRepo.save(book);
    }

    public Book getBook(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
}
