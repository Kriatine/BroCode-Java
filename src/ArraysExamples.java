import java.util.Arrays;

public class ArraysExamples {
    public static void main(String [] args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        Arrays.sort(fruits); // Sorts the values alphabetically

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length; // displays the number of elements inside arrays
        System.out.println(numOfFruits);

        for(int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        for(String fruit : fruits){// fruit is the unique identifier for the elements inside the array
            System.out.println(fruit); // this is called enhanced for loop
        }

        Arrays.fill(fruits, "pineapple");
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);


    }
}
