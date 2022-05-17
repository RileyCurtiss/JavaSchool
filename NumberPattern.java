import java.util.Scanner;

public class NumberPattern {
   
   static boolean complete = false;
   static int maxNum = 0;
   
   public static int printNumPattern( int n1, int n2 ) { 
    maxNum = Math.max( maxNum, n1 );
    System.out.print( n1 + " " );
    if ( n1 > 0 && complete == false ) {
        return printNumPattern( n1 - n2, n2 );
    }
    else if ( n1 < maxNum ) {
        complete = true;
        return printNumPattern( n1 + n2, n2 );
    }
    return 0;
   }
  
   public static void main(String[] args) { 
      try (Scanner scnr = new Scanner(System.in)) {
        int num1;
          int num2;
          
          num1 = scnr.nextInt();
          num2 = scnr.nextInt();
          printNumPattern(num1, num2);
    } 
   } 
} 