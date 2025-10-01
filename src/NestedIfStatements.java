import javax.xml.transform.Source;

public class NestedIfStatements {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of %20 and a student discount of %10");
                price = price*0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price = price*0.9;

            }
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of %20");
                price = price * 0.8;
            } else {
                price = price * 1;
            }
        }
        System.out.printf("Price is %.2f$", price);
    }
}
