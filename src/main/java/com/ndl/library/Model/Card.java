package com.ndl.library.Model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Card {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private Reader reader;

    private Date createTime;

    private Date updateTime;

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
}
