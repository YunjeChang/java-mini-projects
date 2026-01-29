import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // ROCK PAPER SCISSORS GAME

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playersChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playersChoice = sc.nextLine().toLowerCase();
            if (!playersChoice.equals("rock") && !playersChoice.equals("paper") && !playersChoice.equals("scissors")) {
                System.out.println("Invalid choice.");
                continue;
            }

            computerChoice = choices[rd.nextInt(0, 3)];
            System.out.printf("Computer choice: %s\n", computerChoice);


            if (playersChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playersChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playersChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playersChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");

            } else {
                System.out.println("You lose!");

            }

            System.out.print("Play again (yes/no): ");
            playAgain = sc.nextLine();
            // GOODBYE MESSAGE
        }while(playAgain.equals("yes"));

        System.out.println("Thank for playing!");

        sc.close();
    }
}
