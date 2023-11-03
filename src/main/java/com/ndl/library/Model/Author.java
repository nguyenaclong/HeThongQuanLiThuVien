// package com.ndl.library.Model;

// import java.sql.Date;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import lombok.Data;

// @Entity
// @Table(name = "author")
// @Data
// public class Author {
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Id
//     private int id;

//     @Column(name="name")
//     private String name;

//     @Column(name="birthday")
//     private Date birthday;

//     @Column(name="endday")
//     private Date endday;

//     @Column(name="nationality")
//     private String nationality;

//     public Author() {
//     }

//     public Author(String name, Date birthday, Date endday, String nationality) {
//         this.name = name;
//         this.birthday = birthday;
//         this.endday = endday;
//         this.nationality = nationality;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public Date getBirthday() {
//         return birthday;
//     }

//     public void setBirthday(Date birthday) {
//         this.birthday = birthday;
//     }

//     public Date getEndday() {
//         return endday;
//     }

//     public void setEndday(Date endday) {
//         this.endday = endday;
//     }

//     public String getNationality() {
//         return nationality;
//     }

//     public void setNationality(String nationality) {
//         this.nationality = nationality;
//     }
// }
