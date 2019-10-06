import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 * Implements an unbalanced binary search tree. Note that all "matching" is
 * based on the compareTo() method.
 *
 *
 *
 *
 * ******SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 * @param <T>
 *            The type of data element contained in the node.
 * @version <11/29/2018>
 */

public class BinarySearchTree<T extends Comparable<? super T>> {

    private BinaryNode<T> root;
    private int studentCounter = 0;
    private int studentA;
    private int studentAminus;
    private boolean found = false;
    private boolean removed = false;
    private Student stud;


    // ----------------------------------------------------------
    /**
     * This is our constructor that sets the root
     *
     */
    public BinarySearchTree() {
        root = null;
    }


    // ----------------------------------------------------------
    /**
     * this is a getter for the root
     *
     * @return the root
     */
    public BinaryNode<T> getRoot() {
        return root;
    }


    /**
     * is a boolean that will help us determine whether or not a student is
     * found or not
     *
     * @param x
     *            of generic type
     * @param node
     *            binary node that is going to be storing the data
     * @return ture or false
     */
    public boolean searchTwoName(T x, BinaryNode<T> node) {
        return found;

    }


    // ----------------------------------------------------------
    /**
     * Does not print out the found for the students
     *
     * @param x
     *            the generic type
     * @param node
     *            that is going to be holding the data
     * @return either true or false
     */
    public boolean searchTwoNameNoFound(T x, BinaryNode<T> node) {
        return found;

    }


    // ----------------------------------------------------------
    /**
     * this goes thru the whole bst and looks at both first name and last name
     * to see if there are people with same last name or first name
     *
     * @param x
     *            of generic type
     * @param node
     *            which is the node that stores the student data
     */
    public void searchAllNames(T x, BinaryNode<T> node) {
        studentCounter = 0;

    }


    // ----------------------------------------------------------
    /**
     * A counter for the students found for whatever we neeed the student count
     * for
     *
     * @return the studentCounter
     */
    public int getStudentFound() {
        return studentCounter;
    }


    // ----------------------------------------------------------
    /**
     * Returns a student if a student is found
     *
     * @return a student
     */
    public Student foundStudent() {
        return stud;
    }


    // ----------------------------------------------------------
    /**
     * prints the order traversal for the BST
     *
     * @param node
     *            that will store the student info
     */
    public void printInorder(BinaryNode<T> node) {

    }


    // ----------------------------------------------------------
    /**
     * Insert into the tree.
     *
     * @param x
     *            generic type
     *            the item to insert.
     *            .
     */
    public void insert(T x) {

        root = insert(x, root);

    }


    // ----------------------------------------------------------
    /**
     * This is where we keep track of the amount of students for each grade
     * category
     *
     * @param node
     *            that holds the student record
     */
    public void grade1(BinaryNode<T> node) {
        // print out the amount of the students in each grade level
        studentA = 0;

        grade(node);

    }


    // ----------------------------------------------------------
    /**
     * Remove the specified value from the tree.
     *
     * @param x
     *            the item to remove.
     *
     */
    public void remove(T x) {

        root = remove(x, root);

    }


    // ----------------------------------------------------------
    /**
     * Make the tree logically empty.
     */
    public void makeEmpty() {
        root = null;
    }


    // ----------------------------------------------------------
    /**
     * Test if the tree is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return root == null;
    }


    // ----------------------------------------------------------
    /**
     * Internal method to get element value stored in a tree node, with safe
     * handling of null nodes.
     *
     * @param node
     *            the node.
     * @return the element field or null if node is null.
     */
    private T elementAt(BinaryNode<T> node) {
        return (node == null) ? null : node.getElement();
    }


    // ----------------------------------------------------------
    /**
     * Internal method to a value into a subtree.
     *
     * @param x
     *            the item to insert.
     * @param node
     *            the node that roots the subtree.
     * @return the new root of the subtree.
     *
     */
    private BinaryNode<T> insert(T x, BinaryNode<T> node) {

        return node;
    }


    // ----------------------------------------------------------
    /**
     * Internal method to remove a specified item from a subtree.
     *
     * @param x
     *            the item to remove.
     * @param node
     *            the node that roots the subtree.
     * @return the new root of the subtree.
     *
     */
    public BinaryNode<T> remove(T x, BinaryNode<T> node) {

        BinaryNode<T> result = node;

        return result;
    }


    private void grade(BinaryNode<T> node) {

        grade(node.getRight());

    }


    // ----------------------------------------------------------
    /**
     *
     * Goes thru the entire list of students and compares to see if their scores
     * are within
     * the parameter.
     *
     * @param score
     *            the score that will be used to determine the find pair
     *
     *
     */
    public void findPair(int score) {

    }

}
