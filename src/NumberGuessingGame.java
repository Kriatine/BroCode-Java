import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d: ",min ,max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again.");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attemps: " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won!");

        scanner.close();


    }


}
