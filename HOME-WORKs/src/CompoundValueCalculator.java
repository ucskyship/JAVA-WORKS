import java.util.Scanner;

public class CompoundValueCalculator {
    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);

        System.out.print("Enter monthlySavingAmount: ");
        double savings = cal.nextDouble();

        double monthlyInterestRate = 0.05/12;

        double firstMonth = savings * (1 + monthlyInterestRate);
        double secondMonth = (savings + firstMonth) * (1 + monthlyInterestRate);
        double thirdMonth = (savings + secondMonth) * (1 + monthlyInterestRate);
        double fourthMonth = (savings + thirdMonth) * (1 + monthlyInterestRate);
        double fifthMonth = (savings + fourthMonth) * (1 + monthlyInterestRate);
        double sixthMonth = (savings + fifthMonth) * (1 + monthlyInterestRate);

        System.out.printf("After the sixth month, the  account value is $%.2f", sixthMonth);
    }
}
