package com.pault.demo.records;

import java.util.Objects;

public class StudentClass {
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private String name;
    private String email;


    public StudentClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
