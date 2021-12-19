package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.TextConstraints.WRONG_INPUT_DATA;

public class View {


    public static final String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle
//            .getBundle(MESSAGE_BUNDLE_NAME, new Locale("ru"));
            .getBundle(MESSAGE_BUNDLE_NAME, new Locale("ua"));

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getBundleMessage(String message) {
        return bundle.getString(message);
    }
}
