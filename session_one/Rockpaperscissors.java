import java.util.Scanner;
import java.util.Random;

public class Rockpaperscissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rock Paper Scissors Game");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int computer = random.nextInt(3) + 1;

        System.out.println("Computer choice: " + computer);

        if (user == computer) {
            System.out.println("It's a tie!");
        }
        else if ((user == 1 && computer == 3) ||
                 (user == 2 && computer == 1) ||
                 (user == 3 && computer == 2)) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}