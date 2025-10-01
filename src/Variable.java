public class Variable {
    public static void main(String[] args) {

        /* variable = a reusable container for a value
                      a variable behaves as if it was the value it contains

                      Primitive = simple value stored directly in memory (stack)
                      Reference = memory address (stack) that points to the (heap)

                      Primitve vs Reference

                      int           string           int is whole numbers (52)              strings are a series of characters
                      double        array            double's include decimals(5,1)
                      char          object           char means single characters
                      boolean                        booleans are either true or false

                      2 Steps to creating a variable

                      1. declaration
                      2. assignment



         */

        int age; // this is the first step, declaration
        age = 18; // this is the second step, assignment
        System.out.println(age);

        double gpa;
        gpa = 4.4;
        System.out.println(gpa);

        double price = 5.4;
        System.out.println(price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        boolean isMale = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isMale);

        if (forSale) { // this is a more popular way of using booleans
            System.out.println("This is for sale");
        } else {
            System.out.println("This is on its regular price");
        }

        String name = "Yağız";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String color;
        color = "red";

        System.out.println("My name is " + name);
        System.out.println("My favorite food is " + food);
        System.out.println(email);
        System.out.println(name + "'s favorite food is " + food);
        System.out.println(name + " " + email);

        String namee = "Yağız";
        int gta = 6;
        double pi  = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;




    }

}
