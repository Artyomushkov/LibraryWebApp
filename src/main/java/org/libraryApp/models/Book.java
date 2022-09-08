package org.libraryApp.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {

    private int id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String author;
    @Min(value = 0, message = "Year should be greater than 0")
    @Max(value = 2022, message = "Year should be less than 2023")
    private int year;
    private String holder;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }
}
