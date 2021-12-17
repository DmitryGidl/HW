package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
