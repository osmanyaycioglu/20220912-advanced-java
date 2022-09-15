package org.training.advanced.immutable;

import java.util.Objects;

public class PersonMutable {
    private String name;
    private String surname;
    private String department;
    private Integer height;

    public PersonMutable() {
    }

    public PersonMutable(String name,
                         String surname,
                         String department,
                         Integer height) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.height = height;
    }

    public static PersonMutable createPerson(){
        return  new PersonMutable();
    }

    public String getName() {
        return name;
    }

    public PersonMutable setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonMutable setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public PersonMutable setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public PersonMutable setHeight(Integer height) {
        this.height = height;
        return this;
    }
}
