package com.crio.debugging.csv;

public class Person {
    private String id, firstName, lastName, email, phone, profession;

    public Person(String id, String firstName, String lastName, String email, String phone, String profession) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.profession = profession;
    }

    public Person(String[] nextLine) {
        this.id = nextLine[0];
        this.firstName = nextLine[1];
        this.lastName = nextLine[2];
        this.email = nextLine[3];
        this.phone = nextLine[4];
        this.profession = nextLine[5];
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getProfession() {
        return profession;
    }
}
