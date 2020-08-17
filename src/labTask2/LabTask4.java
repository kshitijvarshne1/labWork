/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jul-20
 *   Time: 10:52 PM
 *   File: LabTask4.java
 */

package labTask2;

/*4. Create a program in Java to demonstrate declaration, initialization and usage of static and
non-static variables. */
class StudentIdentity {
    static int studentRollNo = 23;  //static
    String name = "Satyam";

    static void showStudentRollNo() {
        System.out.println("Student Roll NO :- " + studentRollNo); //static variable access thru static method
        /*  System.out.println("Student Name :- "+name); <<- Not accessible */
    }

    void showStudentName() {
        System.out.println("Student Roll NO :- " + studentRollNo); //static variable access thru non staic method
        System.out.println("Student Name :- " + name); // Non static variable access thru only non static method here.
    }
}


public class LabTask4 {
    public static void main(String[] args) {
        StudentIdentity.showStudentRollNo();// call in static method
        StudentIdentity satyam = new StudentIdentity();
        satyam.showStudentName();
    }


}