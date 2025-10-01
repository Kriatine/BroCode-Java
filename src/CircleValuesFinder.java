import java.util.Scanner;

public class CircleValuesFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Is you object a circle(true) or a sphere(false)?:");
        boolean object = scanner.nextBoolean();

        if(object == true){

            System.out.print("What is the radius of your circle?:");
            double radiusCircle = scanner.nextDouble();

            System.out.println("Your circles circumference is " + 2*Math.PI*radiusCircle);
            System.out.println("Your circles area is " + Math.PI*Math.pow(radiusCircle, 2));
        }
        else{
            System.out.print("What is the radius of your sphere?");
            double radiusSphere = scanner.nextDouble();

            System.out.println("Your spheres volume is " + 4/3*Math.PI*Math.pow(radiusSphere, 3));
            System.out.println("Your spheres area is " + 4*Math.PI*Math.pow(radiusSphere, 2));
        }

    scanner.close();

    }
}
