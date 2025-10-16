import java.sql.SQLOutput;
import java.util.Scanner;

public class CSE101T_Assignment1YağızKonya {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Digital Monster Creation Arena ---");
        System.out.print("Let's create your first monster. Give it a cool name: ");
        String name = scanner.nextLine();

        System.out.println("Now, choose your monster's element. This choice will determine its core strength.");
        System.out.println("[1] Fire (Attack-oriented)");
        System.out.println("[2] Water (Health-oriented)");
        System.out.println("[3] Earth (Defense-oriented)");
        System.out.print("Your choice(1-3): ");
        String element = scanner.nextLine();

        if(element.equals("1"))
            element = "Fire";
        else if(element.equals("2"))
            element = "Water";
        else if(element.equals("3"))
            element = "Earth";
        else{
            System.out.println("Wrong input. Terminating...");
            return;
        }

        System.out.println("Every monster has a potential. Choose its potential: ");
        System.out.println("[1] Normal (Standard stats)");
        System.out.println("[2] Rare (Bonus to all stats)");
        System.out.print("Your choice (1-2): ");
        String potential = scanner.nextLine();
        if(potential.equals("1"))



        System.out.println("Finally, enter a number between 1 and 10 to influence its destiny: ");
        int destiny = scanner.nextInt();

        System.out.println("Excellent choices! Your monster " + name + " is being created...");

        System.out.println("--- MONSTER PROFILE CARD ---");
        System.out.println("Name: " + name);



        }

    }

