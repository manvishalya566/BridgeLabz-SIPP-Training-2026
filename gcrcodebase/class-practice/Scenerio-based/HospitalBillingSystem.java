class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    // Custom Exception Method
    static void processPayment(double billAmount, double balance)
            throws InsufficientFundsException {

        if (balance < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient Funds.");
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        // 1. Division By Zero
        try {
            int totalBill = 5000;
            int items = 0;

            double averageCost = totalBill / items;

            System.out.println("Average Cost: " + averageCost);

        } catch (ArithmeticException e) {
            System.out.println(
                    "Billing Error: Number of items cannot be zero.");
        }

        // 2. Array Index Out Of Bounds
        try {

            String[] patients = {
                    "Rahul",
                    "Priya",
                    "Amit"
            };

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Patient Error: Invalid patient index selected.");
        }

        // 3. Number Format Exception
        try {

            String input = "ABC123";

            int patientId = Integer.parseInt(input);

            System.out.println(patientId);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Input Error: Please enter a valid numeric patient ID.");
        }

        // 4. Custom Exception
        try {

            double billAmount = 10000;
            double accountBalance = 5000;

            processPayment(billAmount, accountBalance);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital Billing System Running Safely...");
    }
}