/*import java.util.Scanner;

public class WhatOrder <T>{
   // TODO: Define a generic method called checkOrder() that 
   //       takes in four variables of generic type as arguments. 
   //       The return type of the method is integer
   public static <T extends Comparable>int checkOrder(T obj1, T obj2, T obj3, T obj4) {
        //-1 if the items are in ascending order 
        //0 if the items are unordered
        //1 if the items are in descending order
     if (obj1.compareTo(obj2) > 0) {
        if (obj2.compareTo(obj3) > 0) {
            if (obj3.compareTo(obj4) > 0) {
                return 1;
            }
        }
    }
    if (obj1.compareTo(obj2) < 0) {
        if (obj2.compareTo(obj3) < 0) {
            if (obj3.compareTo(obj4) < 0) {
                return -1;
            }
        }
    }

    return 0;
   }
   
      // Check the order of the input: return -1 for ascending, 
      // 0 for neither, 1 for descending



   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
   }
}
*/