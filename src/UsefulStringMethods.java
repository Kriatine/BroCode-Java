public class UsefulStringMethods {
    public static void main(String[] args){

        String name = "Yağız Konya";

        int length = name.length(); //how many characters does "name" use
        char letter = name.charAt(0); //shows the characters at the pleased position. Starts from 0
        int index = name.indexOf("a"); // shows when a pleased character occurs. Only for the first character it faces.
        int lastindex = name.lastIndexOf("a"); //shows when a pleased character occurs but from right to left.


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);

        name = name.toUpperCase(); // makes all characters uppercase
        System.out.println(name);   

        name = name.toLowerCase();
        System.out.println(name);

        name = "    Yağız   Konya    ";
        name = name.trim(); // trims all the spaces except between the words.
        System.out.println(name);

        name = name.replace("a", "e"); //replaces all selected letters to another
        System.out.println(name);

        name.isEmpty();
        System.out.println(name.isEmpty());

        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }
        else{
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain a space");
        }

        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.equalsIgnoreCase("yeğız   konye")){ // Ignores Caps characters
            System.out.println("Hello " + name);
        }
        else{
            System.out.println("no.");
        }




    }
}
