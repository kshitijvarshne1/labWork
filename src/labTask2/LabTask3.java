/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jul-20
 *   Time: 9:52 PM
 *   File: LabTask3.java
 */

package labTask2;

/*3. Create a program in Java to demonstrate declaration, initialization and usage of local
variables. */
class Student {

    void showStudentRollNo() {
        int studentRollNo = 23;  //LocalVariable
        System.out.println("Student RooLL No :- " + studentRollNo);
    }
    //studentRollNo not accesible here(not available to access out from the method 'show')
}


public class LabTask3 {
    public static void main(String[] args) {
        Student Shivam = new Student();
        Shivam.showStudentRollNo();// studentRoLLNo <-- local variable access thr
        int studentId = 1915;
        System.out.println("Student ID :- " + studentId);
    }
    //studenId not accesible here(not available to access out from the main method)

}
