/*
MD Abir A. Choudhury
09142018 - Pay
Create a java app that asks the user to enter the payRate and hours
then calculate and display the weekly pay
If hours are more than 40, then employee will get padi with 
the overtime rate which is 1.5 * payRate
*/

import java.util.Scanner;
import java.lang.String;

class Pay {
    public static void main(String[] args) {
        double payRate = 0.0;
        double hours = 0.0;

        Scanner S = new Scanner(System.in);

        // input user numbers
        System.out.println("How many hours did you work?");
        hours = S.nextDouble();
        System.out.println("How much is the pay rate per hour?");
        payRate = S.nextDouble();

        double overtimeHours = 0.0;
        double overtimePay = 0.0;
        double standardPay = 0.0;

        // caluclate overtime pay
        if(hours > 40) {
            overtimeHours = (hours - 40);
            hours = 40;
            overtimePay = overtimeHours * payRate * 1.5;
            standardPay = hours * payRate;
        }
        // calculate standard pay
        standardPay = hours * payRate;
        // calculate total pay
        double total = overtimePay + standardPay;

        // output total pay
        System.out.println("The weekly pay is " + total);
        // close Scanner object
        S.close();
    }
}