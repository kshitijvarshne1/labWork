/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Jul-20
 *   Time: 9:54 AM
 *   File: LabTask2.java
 */

package labTask1;

//Task 2 - Create a program in Java to declare, initialize and use local variables of all the primitive data types in Java.
public class LabTask2 {
    public static void main(String[] args) {
        //Student
        byte studentId = (byte) 2;
        short studentRollno = (short) 288;
        int studentRoomNo = 6523;
        long studentPhoneNo = 214748366;
        float student10thPercentage = 85.6f;
        double student12thPercentage = 80.845754d;
        boolean isStudentStudyRegurlarly = true;
        char studentFirstLetter = 'A';
        System.out.println("Student Id :- " + studentId);
        System.out.println("Student RollNo :- " + studentRollno);
        System.out.println("Student RoomNo :- " + studentRoomNo);
        System.out.println("Student PhoneNo :- " + studentPhoneNo);
        System.out.println("Student 10th Percentage :- " + student10thPercentage);
        System.out.println("Student 12th Percentage :- " + student12thPercentage);
        System.out.println("Is student study regurlarly :- " + isStudentStudyRegurlarly);
        System.out.println("First letter name of Student :-" + studentFirstLetter);
    }
}
