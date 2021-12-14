import java.util.Random;

public class Controller {
    private final Random random = new Random();


    int rand(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    int rand() {
        int randomMax = 100;
        int min = 0;
        return random.nextInt(randomMax - min) + min;
    }

    private int guessCount = 0;
    private int minGuess = 0;
    private int maxGuess = 100;
    private int randomNumber = -1;

    public int playGame(int userGuess) {

        if (randomNumber == -1) randomNumber = rand(5, 50);

        Model.guessHistory.add(userGuess);
        guessCount++;
        if (userGuess < randomNumber) {
            System.out.println("Try Again! You guessed too small ");
            minGuess = userGuess;
        }
        if (userGuess > randomNumber) {
            System.out.println("Try Again! You guessed too high ");
            maxGuess = userGuess;
        }
        if (userGuess == randomNumber) {
            System.out.format("You have guessed the number %d on the %d try. ", randomNumber, guessCount);
            return 1;
        }
        System.out.format("Secret number is between %d and %d \n", minGuess, maxGuess);
        System.out.format("Your previous guesses are %s \n", Model.guessHistory);


        return 0;

    }

}
