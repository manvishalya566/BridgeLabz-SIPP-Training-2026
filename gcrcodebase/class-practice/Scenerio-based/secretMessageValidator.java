import java.util.Scanner;

public class secretMessageValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Code: ");
        String code = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < code.length(); i++) {

            char ch = Character.toLowerCase(code.charAt(i));

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);

        if (code.length() >= 8 && digits >= 2 && special >= 1) {
            System.out.println("Strong Code");
        } else {
            System.out.println("Weak Code");
        }

        sc.close();
    }
} {
    
}
