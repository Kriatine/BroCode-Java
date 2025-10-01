import java.util.Scanner;

public class AreaOfRectangleHomework {

    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the height of the rectangle?");

        height = scanner.nextDouble();

        System.out.println("Whats's the width of the rectangle?");

        width = scanner.nextDouble();

        area = width * height ;

        System.out.println("Your rectangles area is " + area);

        scanner.close();
    }

}
