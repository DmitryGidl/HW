package model;

import java.util.Objects;

public class Contact {
    private final String name;
    private final String surname;
    private final String email;

    public Contact(String name, String surname, String email ) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return    "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(surname, contact.surname) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


}
