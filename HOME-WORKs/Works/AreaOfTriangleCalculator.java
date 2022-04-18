import java.util.Scanner;

public class AreaOfTriangleCalculator {
    public static void main(String[] args) {


        Scanner geometry = new Scanner(System.in);

        System.out.print("Enter firstSideX: ");
        double firstSideX = geometry.nextDouble();
        System.out.print("Enter firstSideY: ");
        double firstSideY = geometry.nextDouble();

        System.out.print("Enter secondSideX: ");
        double secondSideX = geometry.nextDouble();
        System.out.print("Enter secondSideY: ");
        double secondSideY = geometry.nextDouble();

        System.out.print("Enter thirdSideX; ");
        double thirdSideX = geometry.nextDouble();
        System.out.print("Enter thirdSideY: ");
        double thirdSideY = geometry.nextDouble();

        double calArea = (firstSideX * secondSideY - firstSideX * thirdSideY + secondSideX * thirdSideY - secondSideX
                * firstSideY + thirdSideX * firstSideY - thirdSideX * secondSideY)/2;
        System.out.printf("The area of the triangle is %.1f", calArea);
    }

}