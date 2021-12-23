package controller;

import exception.NotUniqueLoginException;
import model.Contact;
import model.Model;
import view.TextConstraints;
import view.View;

import java.util.Scanner;

import static view.TextConstraints.*;

public class Controller {
    View view = new View();
    Model model = new Model();

    public void processInitialUserInput() {
        Scanner scanner = new Scanner(System.in);
        String name = inputName(scanner);
        String login = inputLogin(scanner);


        Contact contact = new Contact(name, login);
        if (!printConsoleIfNotValid(contact)) {
            try {
                model.addContact(contact);
            } catch (NotUniqueLoginException e) {
                view.printMessage(view.getBundleMessage(EXCEPTION_LOGIN_EXISTS));
                login = inputLogin(scanner);
            }
            contact = new Contact(name, login);
            view.printMessage(view.getBundleMessage(SUCCESS) + contact);
        }
    }

    public String inputName(Scanner scanner) {
        view.printMessage(View.bundle.getString(INPUT_DATA) + view.getBundleMessage(FIRST_NAME));
        return scanner.nextLine();


    }

    public String inputLogin(Scanner scanner) {
        view.printMessage(view.getBundleMessage(INPUT_DATA) + view.getBundleMessage(LOGIN));
        return scanner.nextLine();


    }


    private boolean printConsoleIfNotValid(Contact contact) {
        StringBuilder failedFields = getFailedFields(contact);
        if (!failedFields.isEmpty()) {
            view.printMessage(view.getBundleMessage(WRONG_INPUT_DATA) + failedFields);
            return true;
        } else return false;

    }

    private StringBuilder getFailedFields(Contact contact) {
        StringBuilder failedFields = new StringBuilder();
        String name = contact.getName();
        String surname = contact.getLogin();

        if (!name.matches(view.getBundleMessage(REGEX_NAME)))
            failedFields.append("Name ").append(name).append("\n");
        if (!surname.matches(view.getBundleMessage(REGEX_LOGIN)))
            failedFields.append("Login ").append(surname).append("\n");
        return failedFields;
    }

}
