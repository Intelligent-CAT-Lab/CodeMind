import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = isLeap(y);
        int week = getWeekday(y, 1, 1);
        while (true) {
            y = y + 1;
            if (isLeap(y) == is_run && getWeekday(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        return cal.isLeapYear(year);
    }

    private static int getWeekday(int year, int month, int day) {
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}