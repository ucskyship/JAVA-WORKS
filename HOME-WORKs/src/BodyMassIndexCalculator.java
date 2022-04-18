import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {


        Scanner value = new Scanner(System.in);

        System.out.print("Enter your weightInPounds: ");
        double weightInPounds = value.nextDouble();

        System.out.print("Enter your heightInInches: ");
        double heightInInches = value.nextDouble();

        double bodyMassIndex = weightInPounds * 0.45359237/(heightInInches * 0.0254 * heightInInches * 0.0254);

        System.out.printf("Your BodyMassIndex is %.4f%n", bodyMassIndex);
    }

}
