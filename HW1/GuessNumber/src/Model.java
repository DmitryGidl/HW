import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Model {
    private Set<Integer> guessHistory = new HashSet<>();
    private final Random random = new Random();
    public int randomNumber;
    public int minBarrier;
    public int maxBarrier;


    int rand() {
        return random.nextInt(maxBarrier - minBarrier) + minBarrier;
    }

    public void setBarriers(int minBarrier, int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public void generateRandomNumber() {
        randomNumber = rand();
    }

    public boolean ifGussed(int guess) {
        guessHistory.add(guess);
        if (guess == randomNumber) return true;
        else if (guess > randomNumber) maxBarrier = guess;
        else minBarrier = guess;
        return false;
    }


    public Set<Integer> getGuessHistory() {
        return guessHistory;
    }


    public int getRandomNumber() {
        return randomNumber;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }
}
