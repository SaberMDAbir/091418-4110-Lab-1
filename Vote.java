/*
MD Abir A. Choudhury
09142018 - Vote
*/

import javax.swing.JOptionPane;
import java.lang.String;

class Vote {

    public static void main(String[] args) {
        int age = 0;
        // User enters the age
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age: "));
        System.out.println("\n");

        // if age >= 18 then test to see whether person is registered
        if(age >= 18) {
            int input = JOptionPane.showConfirmDialog(null,"Did you register to vote? Yes or No");
            if(input == 0) { // yes
                JOptionPane.showMessageDialog(null, "You can vote!", "Confirmation", JOptionPane.PLAIN_MESSAGE);
            }
            else if(input == 1) { // no
                JOptionPane.showMessageDialog(null, "You need to register to vote.", "Confirmation", JOptionPane.PLAIN_MESSAGE);
            }
            else if(input == 2) { // cancel
                System.exit(0); // End the program
            }
        }
        // If user's age is less than 18
        else {
            JOptionPane.showMessageDialog(null, "Too young to vote", "Confirmation", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
}