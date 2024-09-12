//1. Write a program for division with proper divide-by-zero exception handling
package exceptionhandling;
import java.util.Scanner;

public class Code1 {
    
    public static void main(String[] args) {
        Scanner xs=new Scanner(System.in);
        System.out.println("Give any two numbers to divide:");
        int a=xs.nextInt(),b= xs.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by 0");
        }
    }
}
