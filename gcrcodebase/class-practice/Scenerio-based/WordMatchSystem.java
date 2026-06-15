import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        System.out.println("Uppercase String 1: " + str1.toUpperCase());
        System.out.println("Uppercase String 2: " + str2.toUpperCase());

        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        String s1 = str1.replace(" ", "").toLowerCase();
        String s2 = str2.replace(" ", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }

        sc.close();
    }
