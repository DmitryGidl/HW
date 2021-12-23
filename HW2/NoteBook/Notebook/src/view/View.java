package view;

public class View {
    public static final String WELCOME_MESSAGE_NAME = "Please, enter contact's name";
    public static final String WELCOME_MESSAGE_SURNAME = "Great, enter contact's surname";
    public static final String WELCOME_MESSAGE_EMAIL = "Please, enter contact's email";
    public static final String CONTACT_NOT_VALID_MESSAGE = "Exception, These fields are not valid: ";
    public static final String  CONTACT_REGISTRED_MESSAGE = "Success! Your contact is registred. ";


    public void printMessage(String message) {
        System.out.println(message);
    }
}
