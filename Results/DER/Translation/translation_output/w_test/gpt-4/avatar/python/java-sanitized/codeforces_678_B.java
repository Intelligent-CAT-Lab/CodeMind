import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isRun = isLeapYear(y);
        int week = getDayOfWeek(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeapYear(y) == isRun && getDayOfWeek(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // In Java Calendar, January is 0
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}