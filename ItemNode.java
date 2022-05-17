package DLL;

public class ItemNode {
    private String item;
    private ItemNode nextNodeRef; // Reference to the next node                                        
 
    public ItemNode() {
       item = "";
       nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public ItemNode(String itemInit) {
       this.item = itemInit;
       this.nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public ItemNode(String itemInit, ItemNode nextLoc) {
       this.item = itemInit;
       this.nextNodeRef = nextLoc;
    }
 
    // Insert node after this node.                                                                   
    public void insertAfter(ItemNode nodeLoc) {
       ItemNode tmpNext;
 
       tmpNext = this.nextNodeRef;
       this.nextNodeRef = nodeLoc;
       nodeLoc.nextNodeRef = tmpNext;
    }
 
    // TODO: Define insertAtEnd() method that inserts a node
    //       to the end of the linked list  
    public boolean insertAtEnd(ItemNode head, ItemNode current) {
      ItemNode curr = head;
      while (curr.getNext() != null) {
         curr = curr.getNext();
      }
      curr.nextNodeRef = current;
      curr.nextNodeRef.item = current.item;
      return true;
}
 
    // Get location pointed by nextNodeRef                                                             
    public ItemNode getNext() {
       return this.nextNodeRef;
    }
    
    public void printNodeData() {
       System.out.println(this.item);
    }
 }