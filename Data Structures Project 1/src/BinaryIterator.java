import java.util.Stack;

// -------------------------------------------------------------------------
/**
 * ******SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 * @param <T>
 *
 * @version Sep 25, 2019
 */
public class BinaryIterator<T> {

    private Stack<BinaryNode<T>> stack;


    // ----------------------------------------------------------
    /**
     * This is the constructor
     *
     * @param root
     *            node
     */
    public BinaryIterator(BinaryNode<T> root) {

    }


    // ----------------------------------------------------------
    /**
     * true or false is the stack has a next
     *
     * @return true or falseF
     */
    public boolean hasNext() {
        // simple check wheter or not there is a next element in the stackx
        return !stack.isEmpty();
    }


    // ----------------------------------------------------------
    /**
     * gets the next thing in the stack
     *
     * @return whatever is next in stack
     */
    public T next() {
        return null;

    }

}
