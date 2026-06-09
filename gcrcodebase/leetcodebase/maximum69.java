package gcrcodebase.leetcodebase;

import java.util.Scanner;

public class maximum69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int place = 1;
        int changeplace = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 6) {
                changeplace = place;
            }

            temp /= 10;
            place *= 10;
        }

        System.out.println(num + 3 * changeplace);
    }
}
//leetcode solutions