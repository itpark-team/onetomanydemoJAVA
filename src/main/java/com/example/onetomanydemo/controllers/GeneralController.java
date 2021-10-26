package com.example.onetomanydemo.controllers;

import com.example.onetomanydemo.models.entities.Author;
import com.example.onetomanydemo.models.entities.Book;
import com.example.onetomanydemo.models.tables.TableAuthors;
import com.example.onetomanydemo.models.tables.TableBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/general", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class GeneralController {

    @Autowired
    private final TableBooks tableBooks;
    @Autowired
    private final TableAuthors tableAuthors;

    public GeneralController(TableBooks tableBooks, TableAuthors tableAuthors) {
        this.tableBooks = tableBooks;
        this.tableAuthors = tableAuthors;
    }

    @GetMapping(value = "/getAllBooks")
    public List<Book> getAllBooks() throws Exception {
        return tableBooks.findAll();

    }

    @GetMapping(value = "/getAllAuthors")
    public List<Author> getAllAuthors() throws Exception {
        return tableAuthors.findAll();
    }
}
