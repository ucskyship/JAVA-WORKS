import java.util.Scanner;

public class CostOfDrive {
        public static void main(String[] args){
                Scanner costOfDrive = new Scanner(System.in);

                
                System.out.println("Enter driveDistance: ");
                double distance  = costOfDrive.nextDouble();

                System.out.println("Enter milePerGallon: ");
                double efficiency = costOfDrive.nextDouble();

                System.out.println("Enter pricePerGallon: ");
                double price = costOfDrive.nextDouble();

                double yourCost = (efficiency/price);
                System.out.printf("The your cost is %d%n", yourCost);

        }

}
