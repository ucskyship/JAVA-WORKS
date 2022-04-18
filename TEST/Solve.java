import java.util.Scanner;

public class Solve {

	public static void main(String... args) {
		Scanner Calculate = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
			int firstNumber = Calculate.nextInt();
		
		System.out.print("Enter second integer: ");
			int secondNumber = Calculate.nextInt();
		
		int Sum = firstNumber + secondNumber;
		int Product = firstNumber * secondNumber;
		int Quotient = firstNumber / secondNumber;
		int Difference = firstNumber - secondNumber;
			System.out.printf("Sum is %d%nProduct is %d%nQuotient is %d%nDifference is %d%n", Sum, Product, Quotient, Difference);
	}

}
