

public  class TaxSystem {
    public static void main(String[] args) {

        // Array of incomes for 10 citizens
        double[] incomes = {
            8000, 12000, 25000, 55000, 70000,
            9000, 45000, 100000, 30000, 6000
        };

        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {
            double income = incomes[i];
            double tax;
            String bracket;

            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            } else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }

            totalTaxCollected += tax;

            System.out.println(
                "Citizen " + (i + 1) +
                " | Income: " + income +
                " | Bracket: " + bracket +
                " | Tax: " + tax
            );
        }

        System.out.println("\nTotal Tax Collected = " + totalTaxCollected);
    }
} {
    
}
