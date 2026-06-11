import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SpyAgency {

    public static void main(String[] args) {

        String message = "madam";

        // Reverse String
        String reversed = new StringBuilder(message).reverse().toString();
        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reversed);

        // Palindrome Check
        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }

        // Count Vowels and Consonants
        int vowels = 0;
        int consonants = 0;

        for (char ch : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram Check
        String intercept1 = "listen";
        String intercept2 = "silent";

        char[] arr1 = intercept1.toLowerCase().toCharArray();
        char[] arr2 = intercept2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        // First Non-Repeating Character
        String log = "swiss";

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char ch : log.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char firstNonRepeating = '\0';

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeating = entry.getKey();
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}