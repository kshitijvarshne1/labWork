/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jul-20
 *   Time: 9:34 PM
 *   File: LabTask2.java
 */

package labTask2;

/*2. Create a program in Java to create local variables with the var keyword. Assign the value of
 all 8 primitive data types to 8 variables.  */
public class LabTask2 {
    public static void main(String[] args) {
        var studentId = (byte) 2;
        var studentRollno = (short) 28;
        var studentRoomNo = 653;
        var studentPhoneNo = 9300000000l;
        var student10thPercentage = 85.6f;
        var student12thPercentage = 80.845754d;
        var isStudentStudyRegurlarly = true;
        var studentFirstLetter = 'A';
        System.out.println("Student Id :- " + studentId);
        System.out.println("Student RollNo :- " + studentRollno);
        System.out.println("Student RoomNo :- " + studentRoomNo);
        System.out.println("Student PhoneNo :- " + studentPhoneNo);
        System.out.println("Student 10th Percentage :- " + student10thPercentage);
        System.out.println("Student 12th Percentage :- " + student12thPercentage);
        System.out.println("Is student study regurlarly :- " + isStudentStudyRegurlarly);
        System.out.println("First letter of Student :- " + studentFirstLetter);
    }
}