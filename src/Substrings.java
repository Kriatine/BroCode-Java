import java.util.Scanner;

public class Substrings { // .substring() = A method used to extract a portion of a string. .substring(start, end)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email:");
        String email = scanner.nextLine();

        if (email.contains("@")) {

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1); // We add 1 to not take the @ symbol

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Invalid mail. Please use @ symbol.");
        }
        scanner.close();
    }

}
