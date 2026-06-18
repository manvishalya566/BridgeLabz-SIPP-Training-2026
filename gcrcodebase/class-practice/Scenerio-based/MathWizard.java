
public class MathWizard {

    // Instance Variable
    int number = 100;

    // Check Prime Number
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Factorial using Iteration
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded Factorial Method
    public double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci Number
    public int fibonacci(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    // GCD using Euclidean Algorithm
    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Demonstrating Scope
    public void showScope() {

        // Local Variable
        int number = 50;

        System.out.println("Local Variable: " + number);
        System.out.println("Instance Variable: " + this.number);
    }
}

public class Main {
    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (17): " + mw.isPrime(17));

        System.out.println("Factorial of 5: " + mw.factorial(5));

        System.out.println("Factorial of 6.0: " + mw.factorial(6.0));

        System.out.println("Fibonacci of 7: " + mw.fibonacci(7));

        System.out.println("GCD of 12 and 18: " + mw.gcd(12, 18));

        System.out.println("LCM of 12 and 18: " + mw.lcm(12, 18));

        System.out.println("2^5 = " + mw.power(2, 5));

        mw.showScope();
    }
} {
    
}
