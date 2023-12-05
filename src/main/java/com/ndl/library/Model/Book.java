package com.ndl.library.Model;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "language")
    private String language;

    @JoinColumn(name = "author_id")
    @ManyToOne
    private Author author;

    @JoinColumn(name = "publisher_id")
    @ManyToOne
    private Publisher publisher;

    @Column(name = "published_year")
    private Year publishedYear;

    @Column(name = "number_avail")
    private int numberAvail;

    public Book() {

    }

    public Book(String title, String language, Author author, Publisher publisher, Year publishedYear,
            int numberAvail) {
        this.title = title;
        this.language = language;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.numberAvail = numberAvail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Year getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Year publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getNumberAvail() {
        return numberAvail;
    }

    public void setNumberAvail(int numberAvail) {
        this.numberAvail = numberAvail;
    }

}
