import java.util.Scanner;

public class Controller {
    private Model model = new Model();
    private View view = new View();

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        model.setBarriers(Constraints.MIN_BARRIER, Constraints.MAX_BARRIER);
        model.generateRandomNumber();
        view.printMessage(View.GAME_START);
        while (!model.ifGussed(intputInt(scanner))) {
            view.printMessage(View.GUESS_FAIL + model.getMinBarrier() + " and " + model.getMaxBarrier());
        }
        view.printMessage(View.CONGRATULATION + model.getRandomNumber());
        view.printMessage(View.PREVIOUS_GUESSES + model.getGuessHistory());
    }

    private int intputInt(Scanner scanner) {
        int guess;

        while (true) {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG_INPUTTYPE);
                scanner.next();
            }
            if ((guess = scanner.nextInt()) <= model.getMinBarrier() ||
                    guess >= model.getMaxBarrier()) {
                view.printMessage(View.OUT_OF_RANGE);
                continue;

            }
            break;
        }
        return guess;
    }


}
