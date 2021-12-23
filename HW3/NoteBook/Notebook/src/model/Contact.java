package model;

import java.util.Objects;

public class Contact {
    private final String name;
    private final String login;

    public Contact(String name, String login) {
        this.name = name;
        this.login = login;
    }

    @Override
    public String toString() {
        return    "name='" + name + '\'' +
                ", surname='" + login + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(login, contact.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login);
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }



}
