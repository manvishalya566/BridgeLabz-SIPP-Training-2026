public class RecursiveUtilities {

    // 1. Tower of Hanoi
    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // 2. Recursive Binary Search
    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    // 3. Sum of Digits
    public static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    // 4. Reverse String
    public static String reverseString(String str) {

        if (str.length() <= 1)
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // 5. Balanced Parentheses Without Stack
    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return checkBalance(str, index + 1, count + 1);

        if (str.charAt(index) == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        System.out.println("Tower of Hanoi Moves:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500, 600};
        int target = 400;

        int index = binarySearch(prices, 0, prices.length - 1, target);
        System.out.println("\nPrice found at index: " + index);

        // Sum of Digits
        int number = 12345;
        System.out.println("\nSum of Digits = " + sumOfDigits(number));

        // Reverse String
        String text = "Temple";
        System.out.println("\nReversed String = " + reverseString(text));

        // Balanced Parentheses
        String expr = "((()))";
        System.out.println("\nBalanced Parentheses = " + isBalanced(expr));
    }
}