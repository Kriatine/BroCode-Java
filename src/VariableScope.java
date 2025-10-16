public class VariableScope {

    static int x = 3; //CLASS VARIABLE

    public static void main(String[] args){

        int x = 1; // LOCAL VARIABLE

        System.out.println(x);

        doSomething(); //This basically calls the doSomething method, jumping to line 13 to execute the code within the method
    }
    static void doSomething(){ // void means it will not return anything
         //LOCAL VARIABLE

        System.out.println(x);

    }
}
/* Imagine Class as a thing at the street and Local as a person in a house
people in houses can see the thing that's at the street, but cant see each other */
