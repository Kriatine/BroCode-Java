import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter your weight: ");
            weight = scanner.nextDouble();
            weight *= 0.453592;
            System.out.printf("%.2f", weight);
        }
        else if(option == 2){
            System.out.print("Enter your weight: ");
            weight = scanner.nextDouble();
            weight *= 2.20;
            System.out.println(weight);
        }
        else{
            System.out.println("Invalid value, please try again.");
        }
        scanner.close();
    }
}
