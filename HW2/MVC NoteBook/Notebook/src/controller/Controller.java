package controller;

import model.Contact;
import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Model model = new Model();

    public void processInitialUserInput() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.WELCOME_MESSAGE_NAME);
        String name = scanner.nextLine();
        view.printMessage(View.WELCOME_MESSAGE_SURNAME);
        String surname = scanner.nextLine();
        view.printMessage(View.WELCOME_MESSAGE_EMAIL);
        String email = scanner.nextLine();
        Contact contact = new Contact(name, surname, email);
        if (!printConsoleIfNotValid(contact)) {
            model.addContact(contact);
            view.printMessage(View.CONTACT_REGISTRED_MESSAGE + contact);
        }
    }


    private boolean printConsoleIfNotValid(Contact contact) {
        StringBuilder failedFields = getFailedFields(contact);
        if (!failedFields.isEmpty()) {
            view.printMessage(View.CONTACT_NOT_VALID_MESSAGE + failedFields);
            return true;
        }
        return false;

    }

    private StringBuilder getFailedFields(Contact contact) {
        StringBuilder failedFields = new StringBuilder();
        String name = contact.getName();
        String surname = contact.getSurname();
        String email = contact.getEmail();

        if (!name.matches(RegexContainer.REGEX_NAME_SURNAME))
            failedFields.append("Name ").append(name).append("\n");
        if (!surname.matches(RegexContainer.REGEX_NAME_SURNAME))
            failedFields.append("Surname ").append(surname).append("\n");
        if (!email.matches(RegexContainer.REGEX_EMAIL))
            failedFields.append("Email ").append(email).append("\n");
        return failedFields;


    }
}
