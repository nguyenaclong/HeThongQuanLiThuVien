// package com.ndl.library.Model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "book")
// public class Book {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @Column(name = "title")
//     private String title;

//     private Genre genre;

//     @ManyToOne
//     @JoinColumn
//     private Author author;

//     private Publisher publisher;

//     private String languge;

//     public Book() {

//     }

//     public Book(String title, Genre genre, Author author, Publisher publisher, String languge) {
//         this.title = title;
//         this.genre = genre;
//         this.author = author;
//         this.publisher = publisher;
//         this.languge = languge;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public Genre getGenre() {
//         return genre;
//     }

//     public void setGenre(Genre genre) {
//         this.genre = genre;
//     }

//     public Author getAuthor() {
//         return author;
//     }

//     public void setAuthor(Author author) {
//         this.author = author;
//     }

//     public Publisher getPublisher() {
//         return publisher;
//     }

//     public void setPublisher(Publisher publisher) {
//         this.publisher = publisher;
//     }

//     public String getLanguge() {
//         return languge;
//     }

//     public void setLanguge(String languge) {
//         this.languge = languge;
//     }

// }
