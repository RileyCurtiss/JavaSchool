package Lab9;
import java.util.Arrays;

public class PriorityQueue {

    /* This class is finished for you.
     */
    public static class Customer implements Comparable<Customer> {
        private double donation;

        public Customer(double donation) {
            this.donation = donation;
        }

        public double getDonation() {
            return donation;
        }

        public void donate(double amount) {
            donation += amount;
        }

        public int compareTo(Customer other) {
            double diff = donation - other.donation;
            if (diff < 0) {
                return -1;
            } else if (diff > 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public String toString() {
            return String.format("$%.2f", donation);
        }
    }

    private Customer[] data;
    private int size;

    public PriorityQueue(int capacity) {
        data = new Customer[capacity];
        size = 0;
    }
    
    public PriorityQueue() {
        this(10);
    }

    /* Add a customer to the queue.
     * Remember to do so in a way that keeps the queue in sorted order!
     */
    public void push(Customer customer) {

        //System.out.print( size + " " );
        //System.out.println( customer.toString() );
        //for (Customer c: data) {
        //    System.out.print(c+" ");
        //}
        //System.out.println();
//
        if (size == data.length) { throw new IllegalStateException(); }
        switch(size) {
            case 0:
                data[0] = customer;
            case 1:
                if (customer.compareTo(data[0]) == 1) {
                    data[1] = data[0];
                    data[0] = customer;
                    break;
                }
                else { data[1] = customer; break;}
            default:
                for (int index = size-1; index > -1; index--) {
                    if (customer.compareTo(data[index]) == -1) {
                        data[index+1] = customer;
                        break; 
                    }
                    else {
                        if (index == 0) { submitAtFront(customer); 
                            break; }
                        else { data[index+1] = data[index]; }
                    }
                    }
        }
        size++;
    }

    public void submitAtFront(Customer customer) {
        Customer[] newA = new Customer[data.length];
        newA[0] = customer;
        for (int index = 0; index < size; index++) {
            newA[index+1] = data[index];
        }
        data = newA;
    }

    /* Remove and return the highest priority customer from the queue.
     */
    public Customer pop() {
        Customer[] newA = new Customer[data.length];
        Customer ret = data[0];
        for (int index = 1; index < size; index++) {
            newA[index-1] = data[index];
        }
        data = newA;
        size--;
        return ret;
    }

    /* Return, but don't remove, the highest priority item from the queue.
     */
    public Customer peek() {
        Customer ret = data[0];
        return ret;
    }

    /* Given the index of a customer, increase their donation amount, letting
     * them cut in line if necessary. 
     *
     * Refer to the Customer class to remind yourself the operations you can do
     * on a customer.
     */
    public void bump(int customerIndex, double amount) {
        Customer[] newA = new Customer[data.length];
        Customer marker = data[customerIndex];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (data[i] != marker) { newA[index] = data[i];
                index++; }
        }
        data = newA;
        size--;
        marker.donate(amount);
        submitAtFront(marker);
        size++;
    }

    public String toString() {
        return Arrays.toString(data);
    }
    
    public int getSize() {
    	return size;
    }

    public static void main(String[] args) {
        PriorityQueue line = new PriorityQueue(6);
        
        System.out.println("Testing push");
        
        line.push(new Customer(10.00));
        line.push(new Customer(5.00));
        line.push(new Customer(1.00));
        
        System.out.println("Line should be:\n[$10.00, $5.00, $1.00, null, null, null]");
        System.out.println(line);
        
        System.out.println("Line size should be 3 is: " + line.getSize());
        
        System.out.println();
        
        System.out.println("Testing pop");

        System.out.println(line.pop());
        System.out.println(line.pop());
        
        System.out.println();
        
        System.out.println("Testing bump");

        line.push(new Customer(20.00));
        line.push(new Customer(15.00));
        line.push(new Customer(2.00));
        
        line.bump(1, 30.00);
        //System.out.println(line);
        line.bump(3, 60.00);
        //System.out.println(line);
        
        System.out.println(line.pop());
        System.out.println(line.peek());
        System.out.println(line.pop());
        System.out.println(line.pop());
        System.out.println(line.pop());
        System.out.println();
     
        line.push(new Customer(7.00));
        line.push(new Customer(8.00));
        line.push(new Customer(9.00));
        line.push(new Customer(7.00));
        line.push(new Customer(10.00));
        
        System.out.println("Line should be:\n[$10.00, $9.00, $8.00, $7.00, $7.00, null]");
        System.out.println(line);  
        
    }
}