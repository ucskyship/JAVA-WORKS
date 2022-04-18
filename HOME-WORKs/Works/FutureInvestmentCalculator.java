import java.util.Scanner;

public class FutureInvestmentCalculator {
    public static void main(String[] args) {

        Scanner calculate = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = calculate.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = calculate.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = calculate.nextDouble();


        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate/1200), (numberOfYears * 12));


        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }

}
