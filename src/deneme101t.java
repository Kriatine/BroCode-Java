import java.util.Scanner;

public class deneme101t {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Digital Monster Creation Arena ---");
        System.out.print("Let's create your first monster. Give it a cool name: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Now, choose your monster's element. This choice will determine its core strength.");
        System.out.println("[1] Fire (Attack-oriented)");
        System.out.println("[2] Water (Health-oriented)");
        System.out.println("[3] Earth (Defense-oriented)");
        System.out.print("Your choice(1-3): ");
        String element = scanner.nextLine();
        if(!element.equals("1") &&!element.equals("2") &&!element.equals("3")){
            System.out.println("ERROR: Invalid element choice. Exiting program.");
            return;
        }
        System.out.println();
        System.out.println("Every monster has a potential. Choose its potential: ");
        System.out.println("[1] Normal (Standard stats)");
        System.out.println("[2] Rare (Bonus to all stats)");
        System.out.print("Your choice (1-2): ");
        String potential = scanner.nextLine();
        if(!potential.equals("1") && !potential.equals("2")){
            System.out.println("ERROR: Invalid potential choice. Exiting program.");
            return;
        }
        System.out.println();
        System.out.print("Finally, enter a number between 1 and 10 to influence its destiny: ");
        int destiny = scanner.nextInt();
        if(destiny < 1 || destiny > 10) {
            System.out.println("ERROR: Destiny number must be between 1 and 10. Exiting program.");
            return;
        }
        System.out.println();
        System.out.println("Excellent choices! Your monster " + name + " is being created...");

        int hp = 50;
        int ap = 10;
        int dp = 5;

        if(element.equals("1")) {
            element = "Fire";
            ap += 5;
        }
        else if(element.equals("2")) {
            element = "Water";
            hp += 20;
        }
        else{
            element = "Earth";
            dp += 10;
        }

        if(potential.equals("1"))
            potential = "Normal";
        else{
            potential = "Rare";
            hp += 10;
            ap += 10;
            dp += 10;
        }

        if(element.equals("Fire"))
            ap += destiny;
        else if(element.equals("Water"))
            hp += destiny;
        else
            dp += destiny;

        System.out.println();
        System.out.println("--- MONSTER PROFILE CARD ---");
        System.out.println("Name: " + name);
        System.out.println("Element: " + element);
        System.out.println("Potential: " + potential);
        System.out.println();
        System.out.println("Health Points (HP): " + hp);
        System.out.println("Attack Power (AP): " + ap);
        System.out.println("Defense Power (DP): " + dp);
        System.out.println("---------------------------");

    }
}