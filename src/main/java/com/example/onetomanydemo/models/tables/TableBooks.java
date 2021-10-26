package com.example.onetomanydemo.models.tables;

import com.example.onetomanydemo.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableBooks extends JpaRepository<Book, Integer> {
}
