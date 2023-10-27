package com.ndl.library.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String email;

    private String name;

    private Date birthday;

    private String address;

    @Column(name = "phonenumber")
    private String phone;

    private String gender;

    private String idnumber;

    public User() {
    }

    public User(String email, String name, Date birthday, String address, String phone, String gender,
            String idnumber) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.idnumber = idnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
