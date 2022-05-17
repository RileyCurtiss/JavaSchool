import java.util.Scanner;
import java.util.ArrayList;

public class DescendingOrder {
   public static void selectionSortDescendTrace(int[] numbers, int numElements) {
    for (int i = 0; i < numbers.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < numbers.length; j++){  
                if ((int)numbers[j] > (int)numbers[index]){  
                    index = j;  
                }  
            }  
            int numSwap = (int)numbers[index];   
            numbers[index] = (int)numbers[i];  
            numbers[i] = numSwap; 
            //System.out.println(Arrays.toString(numbers)); 
            for (Object o: numbers) {
                System.out.print(o+" ");
            }
            System.out.println();
        }
   }
   
   
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        ArrayList<Integer> killMe = new ArrayList<Integer>();

        while (!killMe.contains(-1)) {
            killMe.add(scnr.nextInt());
        }
        killMe.remove(killMe.size()-1);
        //Object[] newA = killMe.toArray();
        int index = 0;
        int[] newA = new int[killMe.size()];
        for (Integer I: killMe) {
            newA[index] = I;
            index++;
        }
        int numElements = newA.length;
        selectionSortDescendTrace(newA, numElements);
    }
   }
}

/** int [] newArray = new int[numElements];
        int element = 0; int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > element) {
                    element = numbers[j];
                    index = j;
                }
            }
            numbers[index] = 0;
            newArray[i] = element;
            element = 0;
        }
        return newArray;*/