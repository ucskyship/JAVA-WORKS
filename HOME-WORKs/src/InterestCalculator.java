import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        Scanner calculate = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (example 3 for 3%): ");
          double balanceAndInterestRate = calculate.nextDouble();
          double annualInterestRate = calculate.nextDouble();

        double interest = balanceAndInterestRate * annualInterestRate / 1200;

        System.out.printf("The Interest is %.5f", interest);
    }

}
