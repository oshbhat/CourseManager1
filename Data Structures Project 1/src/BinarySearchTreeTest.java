import java.io.FileNotFoundException;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 * this the test case for the BST
 *
 *
 * *******SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 * @version Sep 18, 2019
 */
public class BinarySearchTreeTest extends TestCase {
    private BinarySearchTree<Student> bst;
    private Student student;
    private Student student2;
    private Student student3;
    private Student student4;


    // ----------------------------------------------------------
    /**
     * intializing my field
     */
    public void setUp() {
        bst = new BinarySearchTree<Student>();
        student = new Student("John", "Obi", "55", "0001");
        student2 = new Student("Jeffrey", "Sucm", "22", "0002");
        student3 = new Student("Kenny", "Large", "45", "0003");
        student4 = new Student("Josh", "Bhat", "67", "0004");

    }


    // ----------------------------------------------------------
    /**
     * tests getting root
     */
    public void testGetRoot() {
        assertTrue(bst.isEmpty());

        bst.insert(student);
        // assertEquals(null, bst.getRoot());

    }


    // ----------------------------------------------------------
    /**
     * tests the boolean search3 method
     */
    public void testSearch3() {
        assertTrue(bst.isEmpty());

    }


    // ----------------------------------------------------------
    /**
     * tests Find();
     */
    public void testFind() {
        assertTrue(bst.isEmpty());

    }

}
