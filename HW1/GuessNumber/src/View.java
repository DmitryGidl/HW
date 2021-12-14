import java.util.Scanner;

public class View {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        int minGuess;
        int maxGuess;

while (true) {
    System.out.println("Choose a minimum value of a randomized Integer or leave empty for default");
    String min = scanner.nextLine();
    System.out.println("Great! Now choose a maximum value of a randomized Integer or leave empty for default");
    String max = scanner.nextLine();


    if(!controller.isMinMaxInputCorrect(min, max)) {
        System.out.println("""
                One of the values is Not a Number or Minimum number is bigger than maximum. Try again!\s

                """);
        continue;
    }
    String way = "custom";
    if(controller.isInputBlank(min, max)) {
        way = "default";
         minGuess = 0;
         maxGuess = 100;
    } else {
        minGuess = Integer.parseInt(min);
        maxGuess = Integer.parseInt(max);
    }

    System.out.format("Secret number is randomized in a %s way. You can guess it now! ", way);
    System.out.format("Your secret number is between %d and %d!", minGuess, maxGuess);
    controller.setUpGame(min, max);
    break;

}


        int userGuess;
        int guessResult;
        int guessCount = 0;

        while (true) {
            String input = scanner.next();
            if (!controller.isGuessInputCorrect(input)) {
                System.out.println("Your input was not a number. Try again!");
                continue;
            }
            userGuess = Integer.parseInt(input);
            controller.addNumberToHistory(userGuess);
            guessCount++;

 /*
                if 1 - too big
                if 0 - guessed
                if -1 - too small

*/

            guessResult = controller.playGame(userGuess);
            if (guessResult == 0) {
                System.out.format("You have guessed the number %d on the %d try. ",
                        controller.getRandomNumber(), guessCount);
                break;
            }
            if (guessResult == 1) {
                maxGuess = userGuess;
                System.out.println("Try Again! You guessed too high ");
            }
            if (guessResult == -1) {
                minGuess = userGuess;
                System.out.println("Try Again! You guessed too small ");
            }

            System.out.format("Secret number is between %d and %d %n", minGuess, maxGuess);
            System.out.format("Your previous guesses are %s %n", controller.getNumberToHistory());
        }


    }

}
