//package Lab10;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.charset.MalformedInputException;
//import java.util.*;
//
//
///**
// *
// */
//public class ExpressionTree extends ZTree {
//
//    public Queue<String> parse(String expression) {
//        Queue<String> infix = new LinkedList<>();
//        StringTokenizer tokenizer = new StringTokenizer(expression, "(?<=[-+*()%/])|(?=[-+*()%/])", true);
//        while(tokenizer.hasMoreTokens()){
//            String token = tokenizer.nextToken();
//            if(!token.trim().isEmpty()) {
//                infix.add(token.trim());
//            }
//        }
//        return infix;
//    }
//
//    List<String> postfix = new LinkedList<String>();
//    Stack<String> stack = new Stack<>();
//    public List<String> convert(Queue<String> infix) {
//        String item = infix.peek();
//        if (!isOperator(item)) { postfix.add(item); }
//        else { 
//            if ( stack.isEmpty() || precedence(item) <= precedence(stack.peek())) {
//                stack.push(item);
//            }
//            else {
//                while (!stack.isEmpty() && precedence(item) 
//                    >= precedence(stack.peek()) ) {
//                    postfix.add(stack.pop());
//                }
//                
//                stack.push(item);
//            }
//        }
//        
//        infix.poll();
//        if (!infix.isEmpty()) { convert(infix); }
//        else {
//            removeParathesis();
//            while (!stack.isEmpty()) { postfix.add(stack.pop()); }
//        }
//        return postfix;
//	}
//    
//    public void removeParathesis() {
//        List<String> copy = new LinkedList<String>();
//        for (String each: postfix) {
//            if (!each.equals("(") && !each.equals(")")) {
//                copy.add(each);
//            }
//        }
//        postfix = copy;
//    }
//
//    @Override
//    public void build(List<String> postfix) {
//        Collections.reverse(postfix);
//        for (String token : postfix)
//            buildRecursive(root, token);
//    }
//
//    /**
//     * Builds an expression tree from the postfix representation returned from the convert method.
//     * To build the correct tree, pull tokens from {@code List<String> postfix}, and places
//     * them at the next available node in the tree.
//     * Here is the exact algorithm:
//     * <ol>
//     *     <li> If the tree root is null, create a new node containing the token,
//     *          assign it to the root, and return {@code true}.
//     *     <li> If the right child of the current node is null, create a new node
//     *          with the token, place it in the right child, and return {@code true}.
//     *     <li> If the right child of the current node is an operator, make a recursive
//     *          call passing the right child and token, and return true if successful,
//     *          otherwise continue.
//     *     <li> If the left child of the current node is null, create a new node with
//     *          the token, place it in the left child, and return {@code true}.
//     *     <li> If the left child of the current node is an operator, make a recursive
//     *          call passing the left child and token, and return {@code true} if successful,
//     *          otherwise continue.
//     *     <li> If none of the above code returns {@code true}, then the code has failed to add
//     *          the token to the tree, so return {@code false}.
//     * </ol>
//     *
//     * Our implementation of the recursive method is ~19 lines of code
//     * @param current the current Node being checked
//     * @param token the token to add
//     * @return {@code true}, if successful
//     */
//    public boolean buildRecursive(Node current, String token) {
//        // YOUR CODE HERE
//        if (root == null) { Node newNode = new Node(token);
//            root = newNode; }
//            return false;
//    }
//
//    @Override
//    public String prefix() {
//        return prefixRecursive(root);
//    }
//
//    /**
//     * Concatenates the tokens in the expression tree returned from the
//     * {@link #build(List)} method in <b>prefix</b> order.
//     * <p>
//     * Accumulate the operator first, then the string from the left
//     * and right subtrees. Add an extra space after each token.
//     * <p>
//     * Our implementation of this method is ~2-6 lines of code.
//     * @param current the root node
//     * @return the tokens in prefix order
//     */
//    public String prefixRecursive(Node current) {
//        // YOUR CODE HERE
//
//        return "";
//    }
//
//    @Override
//    public String infix() {
//        return infixRecursive(root);
//    }
//
//    /**
//     * Concatenates the tokens in the expression tree returned from the
//     * {@link #build(List)} method in <b>infix</b> order.
//     * <ol>
//     *     <li> Accumulate the string from the left subtree
//     *     <li> Add the operator
//     *     <li> Accumulate the string from the right subtree
//     * </ol>
//     * This method should add parentheses to maintain the correct evaluation order,
//     * add a left parentheses before traversing the left subtree, and a right
//     * parentheses after traversing the right subtree.
//     * Do not add any space to the expression string.
//     * <p>
//     * Our implementation of this method is ~2-6 lines of code.
//     * @param current
//     * @return the tokens in infix order
//     */
//    public String infixRecursive(Node current) {
//        // YOUR CODE HERE
//
//        return "";
//    }
//
//    @Override
//    public String postfix() {
//        return postfixRecursive(root);
//    }
//
//    /**
//     * Concatenates the tokens in the expression tree returned from the
//     * {@link #build(List)} method in <b>postfix</b> order.
//     * First accumulate the string from the left and right subtrees, then add the
//     * operator. Add an extra space after each token.
//     * <p>
//     * Our implementation of this method is ~2-6 lines of code.
//     * @param current reference to the current node (starts with root)
//     * @return a String representing the tree in postfix order
//     */
//    public String postfixRecursive(Node current) {
//        // YOUR CODE HERE
//
//        return "";
//    }
//
//    public int evaluate() {
//        return evaluateRecursive(root);
//    }
//
//    /**
//     * Traverses the expression tree and produces the correct answer, which should be an integer.
//     * To evaluate, call the recursive version of the method to get the result from the left
//     * subtree, do the same for the right subtree, then combine these two results using the
//     * operator. A case statement based on the operator is needed to perform the mathematical operation.
//     * <p>
//     * Our implementation uses one helper method (~7 lines of code) and is, itself, ~2 lines of code.
//     * @param current
//     * @return
//     */
//    public int evaluateRecursive(Node current) {
//        // YOUR CODE HERE
//
//        return -1;
//    }
//    
//            // Test code for 
//    public static void main(String[] args) {
//        //2 + 10 / 15 * 19 - 4 + (8 - 9)
//
//        ExpressionTree eTree = new ExpressionTree();
//
//        Scanner input = new Scanner(System.in);
//        String expression = input.nextLine();
//
//        System.out.println("Original Expression: " + expression);
//
//        // Verify parse
//        Queue<String> infix = eTree.parse(expression);
//        System.out.println("Infix Tokens: " + infix.toString());
//
//        // Verify convert
//        List<String> postfix = eTree.convert(infix);
//        System.out.println("Postfix Tokens: " + postfix.toString());
//
//        // Verify build
//        eTree.build(postfix);
//        System.out.println("Build: complete");
//
//        // Verify prefix
//        System.out.println("Prefix: " + eTree.prefix());
//
//        // Verify infix
//        System.out.println("Infix: " + eTree.infix());
//
//        // Verify postfix
//        System.out.println("Postfix: " + eTree.postfix());
//
//        // Verify evaluate
//        System.out.println("Evaluate: " + eTree.evaluate());
//
//        // Verify display
//        System.out.println("Display: complete");
//    }
//
//   
//
//}
//