import java.util.Scanner;

public class Usernamevalidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Check spaces
        if (username.contains(" ")) {
            System.out.println("Username contains spaces.");
        } else {
            System.out.println("Username does not contain spaces.");
        }

        // Count characters
        System.out.println("Total Characters: " + username.length());

        // Convert to uppercase
        System.out.println("Uppercase Username: " + username.toUpperCase());

        // Palindrome Check
        String reversed = new StringBuilder(username).reverse().toString();

        if (username.equalsIgnoreCase(reversed)) {
            System.out.println("Username is Palindrome");
        } else {
            System.out.println("Username is Not Palindrome");
        }

        sc.close();
    }
}