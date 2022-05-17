package Lab14;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Graph<E extends Comparable<E>> extends GraphAbstract<E> {
    public Graph() {
        nodes = new ArrayList<GraphNode>();
    }

    /* addEdge
    * Params: data1 & data2, both data items to be added and connected
    * If the either of the data items are not in the nodes ArrayList,
    * add them as new nodes. Otherwise, find the nodes in the ArrayList so
    * you can make them point to each other. Implement so there are no duplicates
    * added to either of the nodes neighbors ArrayList.
    * TODO: implement this method.
    * */
    @Override
    public void addEdge(E data1, E data2) {

        int summary = 0;
        GraphNode one = new GraphNode(data1); 
        GraphNode two = new GraphNode(data2);
        
        for (GraphNode each : nodes) {
            if (each.data == data1) { summary += 1; }
            if (each.data == data2) { summary += 2; }
        }
        
        switch (summary) {
            case 1:
                nodes.add(two); break;
            case 2:
                nodes.add(one); break;
            case 3: 
                break;
            default:
                nodes.add(one); 
                nodes.add(two);
        }
        
        if (!one.neighbors.contains(two)) { one.neighbors.add(two); }
        if (!two.neighbors.contains(one)) { two.neighbors.add(one); }
    }
    

    

    /* depthFirst
     * Param: startNode, the node to start the traversal at
     *
     * First, find the startNode based off of startItem (hint: indexOf())
     * I recommend having an ArrayList of GraphNodes called visisted to keep
     * track of the nodes you've visited.
     *
     * Prints all of the nodes in the graph in depth first order (with a space between nodes)
     * TODO: implement this method.
     * */
    @Override
    public void depthFirst(E startItem) {
    	//YOUR CODE HERE
        int index = 0;
        ArrayList<GraphNode> visited = new ArrayList<>();
        for (GraphNode each : nodes) {
            if (each.data == startItem);
            GraphNode startNode = each; 
        }
        while (visited.size() <= nodes.size()) {

        }

    }

    // Recursive helper method for depthFirst
    private void depthFirst(GraphNode curr, ArrayList<GraphNode> visited) {
    	//YOUR CODE HERE
    }

    
}
