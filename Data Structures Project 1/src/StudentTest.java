import student.TestCase;

// -------------------------------------------------------------------------
/**
 * This is the test case class for student
 *
 *
 * ******SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 *
 *
 *
 * @version Sep 24, 2019
 */
public class StudentTest extends TestCase {

    private Student student1;
    private Student samePersonVal;
    private Student diffPerson;


    // ----------------------------------------------------------
    /**
     * Here I initialize my private field
     */
    public void setUp() {
        student1 = new Student("Jane", "Doe", "60", "0001");

        samePersonVal = new Student("Jane", "Doe", "60", "0001");
        diffPerson = new Student("Big", "Kenny", "24", "0005");

    }


    // ----------------------------------------------------------
    /**
     * Tests to make sure I can get the correct name
     */
    public void testFirstName() {
        assertEquals("Jane", student1.getFirstName());
        assertEquals("Jane", samePersonVal.getFirstName());
        assertEquals("Big", diffPerson.getFirstName());
    }


    // ----------------------------------------------------------
    /**
     * Tests to make sure the get method is working
     *
     */
    public void testSetID() {
        assertEquals("0001", student1.getID());
        student1.setID("5555");
        diffPerson.setID("4444");
        assertEquals("5555", student1.getID());
        assertEquals("4444", diffPerson.getID());

        assertEquals("0001", samePersonVal.getID());

    }


    // ----------------------------------------------------------
    /**
     * Tests to make sure compareTO works
     *
     */
    public void testCompareTo() {

    }


    // ----------------------------------------------------------
    /**
     * Testing my equals method for each condition
     */
    public void testEquals() {
        Student nullStudent = null;
        String s = "";

    }
}
