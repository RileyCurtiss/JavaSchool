package Labbs;
import java.util.Scanner;
import java.util.LinkedList;
//import java.util.ArrayList;

public class ShoppingList {
   public static void main (String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         LinkedList<ListItem> shoppingList = new LinkedList<ListItem>();
         while(scnr.hasNext()) {
            String item = scnr.nextLine();
            if(item.equals("-1")) {
                break;
            }
            else {
               ListItem it = new ListItem(item);
               shoppingList.add(it);
            }
         }
         for (ListItem items: shoppingList) {
           items.printNodeData();
         }
      }
   }
}