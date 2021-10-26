package com.example.onetomanydemo.models.tables;

import com.example.onetomanydemo.models.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableAuthors extends JpaRepository<Author, Integer> {
}
