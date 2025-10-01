public class TernanyOperator {
    public static void main(String[] args){

        //ternary operator (?) = Returns 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String passOrFail;
        passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd;
        evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);

        int hours = 13;

        String timeOfDay;
        timeOfDay = (hours < 12) ? "A.M:" : "P.M.";

        System.out.println(hours);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
