package Lab13;

import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {
       
   public static void main (String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         HashMap<String, Double> studentGrades = new HashMap<String, Double>();
         
         // Students's grades (pre-entered)
         studentGrades.put("Harry Rawlins", 84.3);
         studentGrades.put("Stephanie Kong", 91.0);
         studentGrades.put("Shailen Tennyson", 78.6);
         studentGrades.put("Quincy Wraight", 65.4);
         studentGrades.put("Janine Antinori", 98.2);
         
         // TODO: Read in new grade for a student, output initial 
         //       grade, replace with new grade in HashMap,
         //       output new grade
         String name = scnr.nextLine();
         double grade = scnr.nextDouble();
         System.out.println(name + "'s orginal grade: " + studentGrades.get(name));
         System.out.println(name + "'s new grade: " + grade);
      }
   }
}
