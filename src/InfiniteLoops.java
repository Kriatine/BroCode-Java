import java.sql.SQLOutput;
import java.util.Scanner;

public class InfiniteLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        while (1 == 1) {
            System.out.println("Help! I'm stuck in a loop!");
        }
        */

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.println("Press Q to quit.");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game.");

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");

        int number = 0;

        do{
            System.out.println("Enter a number between 1-10");
            number = scanner.nextInt();

        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);


        scanner.close();
    }

}
