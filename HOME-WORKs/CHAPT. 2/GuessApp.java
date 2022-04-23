//initialize a number and ask user to guess the number and is the user guesses the number tell him correct and
//if the user guess lower tell him too low, if the user guess is higher than the mistery number tell him too h

import java.util.Scanner;

public class GuessApp {
    public static void main(String[] guess) {

        Scanner InputDigit = new Scanner(System.in);
        System.out.print("Guess mystery number: ");
        int userGuess = InputDigit.nextInt();
        int mysteryNumber = 99;

    if (userGuess == mysteryNumber){
        System.out.println("Correct");
        }
    if (userGuess > mysteryNumber){
        System.out.println("Too High dude");
        }
    if (userGuess < mysteryNumber){
        System.out.println("Too low ma gee");
        }
    }
}