//3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code3 {
    
    public static void main(String[] args) {
        Scanner tr=new Scanner(System.in);
        try {
            System.out.print("Enter phone number: ");
            long phoneNum = tr.nextLong();
            System.out.println("Your Number is: " + phoneNum);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers.");
        }
    }
}
