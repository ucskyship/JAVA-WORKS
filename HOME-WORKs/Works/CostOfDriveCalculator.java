import java.util.Scanner;

public class CostOfDriveCalculator {
        public static void main(String[] args){
                Scanner costOfDrive = new Scanner(System.in);


                System.out.print("Enter driveDistance: ");
                double distance  = costOfDrive.nextDouble();

                System.out.print("Enter milePerGallon: ");
                double efficiency = costOfDrive.nextDouble();

                System.out.print("Enter pricePerGallon: ");
                double price = costOfDrive.nextDouble();


                double yourCost = efficiency / price;


                double costOfDistance = distance / yourCost;
                System.out.printf("The cost of driving is %.2f%n ", costOfDistance);
        }

}