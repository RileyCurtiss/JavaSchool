import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PhotoLineups {

   public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      if (nameList.size() == 0) {
         System.out.println(permList);
         return;
      }
      for (int i = 0; i < nameList.size(); i++) {
         String s = nameList.get(i);

         List<String> temp = nameList.subList(0,i);
         List<String> temp2 = nameList.subList(i,i);
         ArrayList<String> names = new ArrayList<String>();
         
         for (String ind: temp) {
            names.add(ind); }

         for (String ind: temp2) {
            names.add(ind); }
         
         permList.add(s);
         allPermutations(permList, names);

      }

   }

   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         ArrayList<String> nameList = new ArrayList<String>();
         ArrayList<String> permList = new ArrayList<String>();

         while (!nameList.contains("-1")) {
            nameList.add(scnr.next());
         }
         nameList.remove(nameList.indexOf("-1"));
         
         allPermutations(permList, nameList);
         for (String s: permList) {
            System.out.println(s+" ");
         }
      }
   }
}