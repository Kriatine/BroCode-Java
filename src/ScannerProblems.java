import java.util.Scanner;

public class ScannerProblems {

    public static void main(String[] args) {

        // COMMON ISSUES

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); /* when we click "Enter" on our keyboard while
        writing an integer, the PC think the enter as \n, meaning "Enter" button is the
        answer we gave to the string.
        To fix that, write scanner.nextLine(); in line 13
        */

        System.out.println("Enter a color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like " + color);

        scanner.close();


    }
}
