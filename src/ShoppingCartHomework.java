import java.util.Scanner;

public class ShoppingCartHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like to buy?");
        int number = scanner.nextInt();

        System.out.println("You have bought " + number + " " + item + "/s");
        System.out.println("Your total is $" + price*number );


        scanner.close();


    }
}
