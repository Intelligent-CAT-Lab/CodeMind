import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = isLeap(y);
        int week = getWeekDay(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeap(y) == is_run && getWeekDay(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}