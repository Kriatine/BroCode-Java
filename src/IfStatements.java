import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        boolean isStudent;

        // ASKING THE NAME
        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.print("What is your age?:");
        int age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didnt enter your name.");
        }
        else{
            System.out.println("Hello " + name + "!");
        }
        // ASKING IF STUDENT
        System.out.print("Are you a student?(true/false):");
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.print("What is your GPA?");
            double gpa = scanner.nextDouble();

            // IF STUDENT WHAT IS GPA
            if(gpa >= 1.0){
                System.out.println("Good work! Your gpa is " + gpa + "! You are passing the class.");

            }
            else{
                System.out.println("Oh no! Your gpa is " + gpa + ". Study harder!");

            }
        }

        // ASKING AGE
        if(age > 18){
            System.out.println("You are an adult!");

        }
        else if(age == 18){ // Single equal sign means assigning in Java, so we need to use == for equations.
            System.out.println("Welcome to being an adult!");
        }
        else {
            System.out.println("You are a minor!");

            scanner.close();
        }
    }
}
