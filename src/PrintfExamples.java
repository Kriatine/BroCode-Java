public class PrintfExamples {
    public static void main(String[] args){

        // printf() is a method used to format output

        // %[flags][width][.precision][specifier-character]

        // % means placeholder

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age); // d is for integer
        System.out.printf("Your height is %f inches tall\n", height); //f is for double. F is for (Floating number)
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9.63;
        double price2 = 10.51;
        double totalPrice;
        totalPrice = price1*price2;

        System.out.printf("%.3f\n", totalPrice); // %.3f means only 3 characters will show up after decimal

        double price3 = 100.14;
        System.out.printf("%+.1f\n", price3); // + outputs a plus

        double price4 = 14215642.26;
        System.out.printf("%,.1f\n", price4); // , divides the number by thousands

        double price5 = -532.24;
        System.out.printf("%(.1f\n", price5); // ( puts the negative numbers in parentheses

        double price6 = 431.25;
        double price7 = -4354.62;
        System.out.printf("% .1f\n", price6); // "space" puts a space at the left of the positive numbers
        System.out.printf("% .1f\n", price7); // "space" does nothing to negative numbers

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); //adding 0 aligns the number to the line we want.
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%05d\n", id4);

        System.out.printf("%4d\n", id1); // not putting 0 literally does not put any 0's while aligning them
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1); // putting - makes them align at the left rather than right, while it puts spaces to the right of the number
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);









    }
}
