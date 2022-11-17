import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Choose a random number from 0-100
        int num = (int)(Math.random() * 100) + 1;

        // Ask the user to guess a number from 0 to 100
        System.out.println("Guess a number from 0 to 100 inclusive:");
        int guess = sc.nextInt();
        if (guess < 0 || guess > 100){
            System.out.println("Invalid input, you must guess between 0 to 100 inclusive.");
            guess = sc.nextInt();

        }
        // Get the first guess using scan.nextInt();
        while (guess != num){
            if (guess > num){
                System.out.println("Too high! Guess again.");
            }
            if (guess < num){
                System.out.println("Too low! Guess again.");
            }
            guess = sc.nextInt();
        }
        System.out.println("You got it! The correct number was " + num);
    }
}
