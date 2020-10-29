/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Oct-20
 *   Time: 6:30 PM
 *   File: Race.java
 */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;
public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.getRabbit().start();
        tortoise.start();
    }
}
