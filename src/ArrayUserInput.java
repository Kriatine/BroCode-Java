import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number of food do you want?");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[size];


        //foods[0] = "pizza";

        //System.out.println(foods[0]);

        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
    scanner.close();

        }


    }


