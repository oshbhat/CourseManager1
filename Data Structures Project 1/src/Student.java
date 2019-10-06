// -------------------------------------------------------------------------
/**
 * This is Student class
 * We have defined a student to have a first name, Last name, grade, and id
 * assoicated
 *
 *
 *
 ******* SOME METHODS THAT I USED, NOT ALL
 * ****** NOT SHOWING ALL METHODS DUE TO HONOR CODE POLICIES**************
 *
 *
 */
public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private String grade;
    private String ids;


    // ----------------------------------------------------------
    /**
     * Constructor for the class.
     *
     * @param first
     *            firstName
     * @param last
     *            lastName
     * @param number
     *            phone number
     * @param id
     *            the id of the student
     *
     */
    public Student(String first, String last, String number, String id) {
        firstName = first;
        lastName = last;
        grade = "0";
        ids = id;
    }


    // ----------------------------------------------------------
    /**
     * gets the first name
     *
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }


    // ----------------------------------------------------------
    /**
     * sets the first name for a student
     *
     * @param firsts
     *            firstName
     */
    public void setFirstName(String firsts) {
        firstName = firsts;
    }


    // ----------------------------------------------------------
    /**
     * gets the last name
     *
     * @return lastName of a student
     */
    public String getLastName() {
        return lastName;
    }


    // ----------------------------------------------------------
    /**
     * setter for last name of a student
     *
     * @param lasts
     *            name for a student
     */
    public void setLastName(String lasts) {
        lastName = lasts;
    }


    // ----------------------------------------------------------
    /**
     * gets the student's grade
     *
     * @return grade of the student
     */
    public String getGrade() {
        return grade;
    }


    // ----------------------------------------------------------
    /**
     * sets the grade of the student
     *
     * @param newGrade
     *            of the student
     */
    public void setGrade(String newGrade) {
        grade = newGrade;
    }


    // ----------------------------------------------------------
    /**
     * getter for the ID
     *
     * @return the id
     */
    public String getID() {
        return ids;
    }


    // ----------------------------------------------------------
    /**
     * setter for the id
     *
     * @param id
     *            which is the id
     */
    public void setID(String id) {
        ids = id;
    }


    // ----------------------------------------------------------
    /**
     * compares for first name and last name
     *
     * @param o
     *            which is a student obj
     * @return either 1 or -1 depending
     */
    public int compareTo(Student o) {
        return 0;

    }


    // ----------------------------------------------------------
    /**
     * Two Student objects are considered equal when their first name and last
     * name are equal
     *
     * @param obj
     *            object that I am comparing to
     *
     * @return a boolean depending on the condition
     */
    public boolean equals(Object obj) {

        return false;
    }


    // ----------------------------------------------------------
    /**
     * toString for student class
     *
     * @return a string
     */
    public String toString() {
        return this.getID() + ", " + this.getFirstName() + " " + this
            .getLastName() + ", score = " + this.getGrade();
    }

}
