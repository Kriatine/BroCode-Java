import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your name\n"); // If we dont use \n, the name entering line will be at the right of the question
        String name = scanner.nextLine(); // this line reads what we write including spaces. If we were to write "next" instead of nextLine, it would not read the spaces and afterwards

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.print("What is your GPA?:");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello there " + name);
        System.out.println(age + " years old");
        System.out.println("Your GPA is " + gpa);

        if(isStudent){
            System.out.println("You are a student");

        }
        else{
            System.out.println("You are not enrolled");
        }
        scanner.close();

    }
}
