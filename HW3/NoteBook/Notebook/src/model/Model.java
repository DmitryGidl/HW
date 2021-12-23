package model;

import exception.NotUniqueLoginException;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Contact> contacts = new ArrayList<>();
    {
        Contact contact = new Contact("Michael", "Crooger");
        contacts.add(contact); // check for already existing login

    }

    public void addContact(Contact contact) throws NotUniqueLoginException {
        if(ifLoginRegistred(contact.getLogin())) throw new NotUniqueLoginException("Not Unique Login ");
        contacts.add(contact);
    }

    public boolean ifLoginRegistred(String login) {
        return contacts.stream()
                .anyMatch(i -> i.getLogin().equals(login));
    }
}
