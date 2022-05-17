import java.util.Scanner;

public class FibonacciSeq {
   
   public static int fibonacci(int n) {
      
      if (n < 2) {
         return n;
      }
      return fibonacci(n-1)+fibonacci(n-2);    
   }
   
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         int startNum;
         
         startNum = scnr.nextInt();
         System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
      }
   }
}
