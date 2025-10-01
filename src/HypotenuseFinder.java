import java.util.Scanner;

public class HypotenuseFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your triangles height?:");
        double height = scanner.nextDouble();

        System.out.print("What is your triangles width?:");
        double width = scanner.nextDouble();

        double hypotenuse;
        hypotenuse = Math.sqrt(Math.pow(height, 2)+Math.pow(width, 2));


        System.out.print("Your triangles hypotenuse is " + hypotenuse + ".");



        scanner.close();
    }
}
