import java.sql.SQLOutput;

public class EnchancedSwitch {
    public static void main(String[] args){

        String day = "Monday";

        switch(day){
            case "Monday", "Wednesday", "Tuesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is weekend");
            default -> System.out.println(day + " is not a day"); //behaves like "else"
        }

    }
}
