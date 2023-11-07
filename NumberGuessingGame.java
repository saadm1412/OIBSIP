import javax.swing.*;
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts=0;
        int score = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game !");
        JOptionPane.showMessageDialog(null, "Your allow to enter numbers between " + lowerBound + " and " + upperBound + ".");
        String chance =JOptionPane.showInputDialog("Enter the no. of maximum attempts in which you will geuss the correct number");
        int maxAttempts=Integer.parseInt(chance);

        while (attempts < maxAttempts) {
            String input = JOptionPane.showInputDialog("Enter your guess  : ");
            int userGuess = Integer.parseInt(input);
            attempts++;

            if (userGuess < targetNumber) {
                JOptionPane.showMessageDialog(null, "Try a higher number.");
            } else if (userGuess > targetNumber) {
                JOptionPane.showMessageDialog(null, "Try a lower number.");
            } else {
                JOptionPane.showMessageDialog(null, "Congratulations! You've guess the correct number in"+attempts + " attempts.");
                score = maxAttempts - attempts + 1;
                JOptionPane.showMessageDialog(null, "Your score is " + score);
                break;
            }
        }

        if (attempts >= maxAttempts) {
            JOptionPane.showMessageDialog(null, "Sorry, you've run out of attempts.Better luck next time...\nThe number was " + targetNumber + ".");
        }
    }
}
