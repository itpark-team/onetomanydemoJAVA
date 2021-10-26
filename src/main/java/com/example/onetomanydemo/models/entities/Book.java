package com.example.onetomanydemo.models.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public double rating;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="author_id")
    //@JsonManagedReference
    public Author author;

    public Book() {
    }
}
