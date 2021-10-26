package com.example.onetomanydemo.models.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference
    public Set<Book> books;

    public Author() {
    }
}
