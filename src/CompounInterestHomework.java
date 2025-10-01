import java.util.Scanner;

public class CompounInterestHomework {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount:");
        double  principal = scanner.nextDouble();

        System.out.print("Enter the interest rate in %:");
        double interest = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year:");
        double compound = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double amount = principal*Math.pow(1 + interest / compound, compound*years);

        System.out.printf("The amount after %d years is %.2f", years, amount);



        scanner.close();
    }
}
