import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // !  = NOT

        double temp = 20;
        boolean isSunny = false;

        if(temp <= 30 && temp >=0 && isSunny){
            System.out.println("Weather is nice!");
            System.out.println("It is sunny outside.");
        }
        else if(temp <= 30 && temp >=0 && !isSunny){
            System.out.println("Weather is nice!");
            System.out.println("It is cloudy outside.");
        }
        else if(temp > 30 || temp < 0){ //At least one condition must be true
            System.out.println("The weather is bad.");
        }
        else{
            System.out.println("f");
        }

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else
            System.out.println("Hello " + username);

        scanner.close();


    }
}
