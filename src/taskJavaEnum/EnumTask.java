package taskJavaEnum;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

enum months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numberOfDays;

    months(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

public class EnumTask {
    public static void main(String[] args) {
        System.out.println("Please enter the month ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toUpperCase();
        scanner.close();
        int a, b;
        int todayDay = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        System.out.println("MONTH: " + new GregorianCalendar().get(Calendar.MONTH));
        months currentMonth = months.valueOf(month);
        switch (currentMonth) {
            case JANUARY:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case FEBRUARY:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case MARCH:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case APRIL:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case MAY:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case JUNE:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case JULY:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case AUGUST:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case SEPTEMBER:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case OCTOBER:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case NOVEMBER:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            case DECEMBER:
                a = currentMonth.getNumberOfDays();
                b = a - todayDay;
                System.out.println(b + " Days left in " + currentMonth + "!");
                break;
            default:
                System.out.println("Wrong entry");
        }

    }
}

