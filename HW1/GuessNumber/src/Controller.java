import java.util.Random;
import java.util.Set;

public class Controller {
    private final Random random = new Random();
    Model model = new Model();


    int rand(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    int rand() {
        int randomMax = 100;
        int min = 0;
        return random.nextInt(randomMax - min) + min;
    }

    public boolean isGuessInputCorrect(String input) {
        return input.matches("\\d+");
    }
    public boolean isMinMaxInputCorrect(String min, String max) {
        if(isInputBlank(min, max)) return true;
        if(!min.matches("\\d+") || !max.matches("\\d+")) return false;
        int minInt = Integer.parseInt(min);
        int maxInt = Integer.parseInt(max);
        return minInt <= maxInt && minInt != maxInt;
    }
    public boolean isInputBlank(String min, String max) {
        return min.isBlank() && max.isBlank();
    }


    int randomNumber;

    public void setUpGame(String minimum, String maximum) {
        if(minimum.isBlank() || maximum.isBlank()) {
            randomNumber = rand();
        }
        else {
            randomNumber = rand(Integer.parseInt(minimum), Integer.parseInt(maximum));
        }

    }

    public int playGame(int userGuess) {

        if (randomNumber == -1) randomNumber = rand(5, 50);
        if (userGuess < randomNumber) return -1;
        if (userGuess > randomNumber) return 1;
        if (userGuess == randomNumber) return 0;

        return -100;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void addNumberToHistory(int number) {
        model.getGuessHistory().add(number);
    }

    public Set<Integer> getNumberToHistory() {
        return model.getGuessHistory();
    }
}
