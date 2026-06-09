import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics: ");
        int physics = sc.nextInt();

        System.out.print("Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average = " + average);

        if (average >= 90) {
            System.out.println("Grade A+");
        } else if (average >= 80) {
            System.out.println("Grade A");
        } else if (average >= 70) {
            System.out.println("Grade B");
        } else if (average >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}