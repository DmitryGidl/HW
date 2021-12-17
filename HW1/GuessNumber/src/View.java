import java.util.Scanner;

public class View {
public static String WRONG_INPUTTYPE = "Your input was not a Number, please, repeat. ";
public static String OUT_OF_RANGE = "Your input was out of the specified range. ";
public static String GUESS_FAIL = "Secret Number's range is updated and now between ";
public static String CONGRATULATION = "Congratulations, You've guessed it. Secret number was ";
public static String PREVIOUS_GUESSES = "Your previous guessed were ";
public static String GAME_START = "GAME has started, Try to guess a secret number between 0 and 100! ";


public void printMessage(String message){
    System.out.println(message);
}

}
