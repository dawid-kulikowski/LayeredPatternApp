package application.domain;

import lombok.Getter;

@Getter

public class User {
    String name;
    String surname;
    int age;

    public User(String name, String surname, int age) throws InvalidAgeException {
        this.name = name;
        this.surname = surname;
        this.age = age;
        if (age<18)
            throw new InvalidAgeException();
        }
    }
