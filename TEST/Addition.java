import java.util.Scanner;

public class Addition {

	public static void main(String... args){
		Scanner calculate = new Scanner(System.in);
		
		System.out.print("Enter firstNumber: ");
		int firstNumber = calculate.nextInt();
		
		System.out.print("Enter secondNumber: ");
		int secondNumber = calculate.nextInt();
		
		int sum = firstNumber + secondNumber;
		
		
		
		System.out.printf("Sum is %%n", sum);
	}
}
