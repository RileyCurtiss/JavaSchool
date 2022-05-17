package Lab14.GraphManip;

// GraphImplementation.java - supplied code for graph assignment

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class GraphImplementation extends GraphAbstract {

    // Main entry point
    public static void main(String[] args) {

      // Instantiate code
        GraphImplementation impl = new GraphImplementation();
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        String startCity = input.nextLine();
        // Read distances chart
        System.out.println("Reading Chart: " + fileName);
        impl.readGraph(fileName);
        System.out.println();

        // Print depth first search
        System.out.println("Depth First Search:");
        impl.depthFirst(startCity);
        System.out.println();
        
        System.out.println("Breadth First Search:");
        impl.breadthFirst(startCity);
        System.out.println();
    
    }

    

    // Reads mileage chart from CSV file
    public void readGraph(String filename) {
        // YOUR CODE HERE
        
    }


    public void depthFirst(String startCity) {
        // YOUR CODE HERE
    }

    // Recursive helper method
    public void depthFirst(int index, ArrayList<Integer> visited) {
        // YOUR CODE HERE
    }

    public void breadthFirst(String startCity) {
        // YOUR CODE HERE
    }


    // Helper functions

    /**
     * Reads the contents of file to {@code ArrayList}
     * @param filename the file to read from
     * @return an ArrayList of the contents
     */
    static ArrayList<String> readFile(String filename) {
        ArrayList<String> contents = new ArrayList<>();
        try(Scanner reader = new Scanner(new File(filename))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (!line.isEmpty())
                    contents.add(line);
            }
        } catch (IOException e) {
            System.err.println("Cannot read chart: " + filename);
        }
        return contents;
    }


}
