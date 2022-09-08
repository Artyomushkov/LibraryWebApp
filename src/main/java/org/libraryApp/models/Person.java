package org.libraryApp.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Person {

    private int id;
    @NotEmpty
    private String name;
    @Min(value = 0, message = "Year should be greater than 0")
    @Max(value = 2023, message = "Year should be lower than 2023" )
    private int year;

    public Person(int id, String fullName, int year) {
        this.id = id;
        this.name = fullName;
        this.year = year;
    }

    public Person() {}

    public void setName(String fullName) {
        this.name = fullName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }
}
