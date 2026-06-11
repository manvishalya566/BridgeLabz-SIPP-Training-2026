

import java.util.HashSet;

public class Warehouse {

    public static void main(String[] args) {

        // Stock quantities
        int[] stock = {50, 20, 80, 40, 20, 60, 80};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        // Find max, min, total
        for (int qty : stock) {
            if (qty > max) {
                max = qty;
            }
            if (qty < min) {
                min = qty;
            }
            total += qty;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        // Detect duplicates
        System.out.print("Duplicate Quantities: ");
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int qty : stock) {
            if (!seen.add(qty)) {
                duplicates.add(qty);
            }
        }

        System.out.println(duplicates);

        // Rotate array by k positions
        int k = 2;
        rotate(stock, k);

        System.out.print("Array after rotation: ");
        for (int num : stock) {
            System.out.print(num + " ");
        }

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\nTransposed Shelf Grid:");

        int rows = shelf.length;
        int cols = shelf[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Rotate array right by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
} {
    
}
