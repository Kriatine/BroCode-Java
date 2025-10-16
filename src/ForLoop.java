import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        // for loops execute some code a CERTAIN amount of time

        for(int i = 0; i <= 10; i++){ //i+=3 or i-=2
            System.out.println("i equals to " + i );

        }

        Scanner scanner = new Scanner(System.in);
        int max;
        System.out.println("Enter how many times you want to loop: ");
        max = scanner.nextInt();

        for(int k = 1; k <= max ; k++){
            System.out.println(k);
        }


    }
}
