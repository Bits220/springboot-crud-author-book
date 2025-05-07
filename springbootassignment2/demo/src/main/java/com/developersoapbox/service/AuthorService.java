package com.developersoapbox.service;

import com.developersoapbox.entity.Author;
import com.developersoapbox.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    public void saveAuthor(Author author) {
        authorRepo.save(author);
    }

    public Author getAuthor(Long id) {
        return authorRepo.findById(id).orElse(null);
    }
}
