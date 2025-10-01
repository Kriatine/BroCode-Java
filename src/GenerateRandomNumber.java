import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args ){

         Random random = new Random();

         int number;
         double number2;
         boolean coinFlip;

         number = random.nextInt(1, 6); // IMPORTANT!!! 6 IS EXCLUDED
         number2 = random.nextDouble(2.55, 8.5);
         coinFlip = random.nextBoolean();


        System.out.println(number);
        System.out.printf("%.2f\n", number2); // "%.2f allows us to limit the number after decimal

        if(coinFlip == true) { // In this context true means heads
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}
