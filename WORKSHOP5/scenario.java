import java.util.Scanner;

/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter deposit amount (minimum Rs. 1000): ");
            double P = sc.nextDouble();

            if (P < 1000) {
                System.out.println("❌ Deposit must be at least Rs. 1000!");
                continue;
            }

            System.out.print("Enter annual interest rate (8% to 12%): ");
            double annualRate = sc.nextDouble();

            if (annualRate < 8 || annualRate > 12) {
                System.out.println("❌ Interest rate must be between 8–12%!");
                continue;
            }

            System.out.print("Enter duration in years (1 to 5 years): ");
            int years = sc.nextInt();

            if (years < 1 || years > 5) {
                System.out.println("❌ Duration must be between 1 to 5 years!");
                continue;
            }

            // ---- Calculations ----
            double monthlyRate = annualRate / 12 / 100.0;
            int months = years * 12;

            // Compound interest formula: A = P(1 + r)^n
            double A = P * Math.pow((1 + monthlyRate), months);

            double feeRate = 0.005;  // 0.5%
            double fee = A * feeRate;

            double finalAmount = A - fee;

            // ---- Output ----
            System.out.println("\n------ FD Summary ------");
            System.out.println("Deposit Amount: Rs. " + P);
            System.out.println("Annual Interest Rate: " + annualRate + "%");
            System.out.println("Duration: " + years + " years");
            System.out.println("Maturity Amount (before fee): Rs. " + String.format("%.2f", A));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount Received: Rs. " + String.format("%.2f", finalAmount));
            System.out.println("------------------------\n");

            System.out.print("Do you want to calculate another FD? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Thank you for using Nepal Investment Bank FD Calculator!");
    }
}

