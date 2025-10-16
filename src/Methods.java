import java.sql.SQLOutput;

public class Methods {
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        String name = "Yağız";
        int age = 25;
        double result = cube(3);
        System.out.println(result);

        String fullName = getFullName("Yağız", "Konya");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a child");
        }


        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

    }
    static void happyBirthday(String birthdayboi, int age){ //Variables of the strings can be not the same
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", birthdayboi);
        System.out.println("You are " + age + " years old!");
        System.out.println("Happy birthday to you!");

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
