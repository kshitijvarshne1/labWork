/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 27-Jul-20
 *   Time: 12:54 PM
 *   File: Lab3Task.java
 */

package labTask3;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter discount coupon code:- ");
        String clientInputDiscountCode = scanner.nextLine();
        scanner.close();
        if (clientInputDiscountCode.isEmpty() || clientInputDiscountCode.isBlank()) {
            System.out.println("The coupan code cannot be blank or empty");
        } else if (clientInputDiscountCode.toLowerCase().equals(DISCOUNT_CODE.toLowerCase())) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("Incorrect coupon code");
        }
    }
}