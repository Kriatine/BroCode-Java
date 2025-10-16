public class OverloadedMethods {
    public static void main(String[] args){

        //overloaded methods = methods that share the same name
        //                     but different parameters
        //                     signature = name + parameters

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        //String pizza = bakePizza("flat bread");
        String pizza = bakePizza("flat bread", "mozzarella", "olives");
        System.out.println(pizza);

    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){ // First double will make the type of the output
                                                     // Second double is declaring what type can user input
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";

    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
}
}
