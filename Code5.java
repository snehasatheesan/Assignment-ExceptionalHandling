 //5. Write program to demonstrate ArrayIndexOutOfBoundsException
package exceptionhandling;
public class Code5 {
   
    public static void main(String[] args) {
        int sc[]={1,2,3,4,5};
        for (int i = 0; i <=5 ; i++) {
            //causes exception when i==5;
            System.out.print(sc[i]+" ");
        }
    }
}
//output:
//1 2 3 4 5 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//         	at GSassignment/exceptionhandling.Code5.main(Code5.java:9)
