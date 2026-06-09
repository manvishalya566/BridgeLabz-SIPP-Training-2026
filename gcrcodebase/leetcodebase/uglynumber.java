package gcrcodebase.leetcodebase;

public class uglynumber {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Is " + n + " an ugly number? " + isUgly(n));
    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false; 
        }
        
        int[] factors = {2, 3, 5};
        
        for (int factor : factors) {
            while (num % factor == 0) {
                num /= factor; 
            }
        }
        
        return num == 1; 
    }
}
//leetcode solutions