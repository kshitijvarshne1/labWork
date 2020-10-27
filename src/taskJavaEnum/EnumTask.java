package taskJavaEnum;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        int todayDay = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        int todayMonth = new GregorianCalendar().get(Calendar.MONTH);
        String[] monthCalender = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        months currentMonth = months.valueOf(monthCalender[todayMonth]);
        switch (currentMonth) {
            case JANUARY:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case FEBRUARY:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case MARCH:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case APRIL:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case MAY:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case JUNE:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case JULY:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case AUGUST:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case SEPTEMBER:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case OCTOBER:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case NOVEMBER:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            case DECEMBER:
                System.out.println(currentMonth.getNumberOfDays() - todayDay + " Days left in " + currentMonth + "!");
                break;
            default:
                System.out.println("Wrong entry");
        }
    }
}

