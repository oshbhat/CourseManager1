// -------------------------------------------------------------------------
/**
 * A basic node stored in an unbalanced binary search tree.
 * This class is not accessible outside of this package.
 *
 *
 *
 * ******SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 * @param <T>
 *            The type of data element contained in the node.
 *
 * @version 2010.04.28
 */
class BinaryNode<T> {
    // ~ Instance/static variables .............................................

    private T element;
    private BinaryNode<T> left;
    private BinaryNode<T> right;


    // ----------------------------------------------------------
    /**
     * Creates a node with no children.
     *
     *
     */
    public BinaryNode() {
        left = null;
        right = null;
    }


    // ----------------------------------------------------------
    /**
     * constructor that assings element and key intial value of null
     *
     * @param e
     *            generic type for our element which will be a student in our
     *            case
     *
     */
    public BinaryNode(T e) {
        left = null;
        right = null;
        element = e;
    }


    // ----------------------------------------------------------
    /**
     * Sets all our private variables with the paramters
     *
     * @param e
     *            for our generic type
     * @param l
     *            for our left node
     * @param r
     *            for our right node
     */
    public BinaryNode(T e, BinaryNode<T> l, BinaryNode<T> r) {
        left = l;
        right = r;
        element = e;

    }


    // ----------------------------------------------------------
    /**
     * getter for our element
     *
     * @return the key
     */
    public T getElement() {
        return element;
    }


    // ----------------------------------------------------------
    /**
     * sets valye for key
     *
     * @param e
     *            the generic type
     * @return what the key is
     */
    public T setElement(T e) {
        element = e;
        return element;
    }


    // ----------------------------------------------------------
    /**
     * returns whatever is on the left side of the tree
     *
     * @return the left node
     */
    public BinaryNode<T> getLeft() {
        return left;
    }


    // ----------------------------------------------------------
    /**
     * sets the value for left node
     *
     * @param p
     *            binary node
     * @return value of left
     */
    public BinaryNode<T> setLeft(BinaryNode<T> p) {
        left = p;
        return left;
    }


    // ----------------------------------------------------------
    /**
     * gets the right side of the tree
     *
     * @return right node
     */
    public BinaryNode<T> getRight() {
        return right;
    }


    // ----------------------------------------------------------
    /**
     * sets the value for the right side of the tree
     *
     * @param p
     *            sets the
     *            binary node
     * @return right value of on tree
     */
    public BinaryNode<T> setRight(BinaryNode<T> p) {
        right = p;
        return right;
    }

}
