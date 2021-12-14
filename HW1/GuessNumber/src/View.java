import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int guessResult = -1;

        while (guessResult != 1) {
            try {
                userGuess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Your input was not a number. Try again!");
                scanner.nextLine();
                continue;
            }

            guessResult = controller.playGame(userGuess);
        }


    }

}
