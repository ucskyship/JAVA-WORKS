import java.util.Scanner;

public class Addition {

	public static void main(String... args){
		Scanner ucj = new Scanner(System.in);
		
		System.out.print("Enter firstNumber: ");
		int firstNumber = ucj.nextInt();
		
		System.out.print("Enter secondNumber: ");
		int secondNumber = ucj.nextInt();
		
		int sum = firstNumber + secondNumber;
		
		
		
		System.out.printf("Sum is %%n", sum);
	}
}
