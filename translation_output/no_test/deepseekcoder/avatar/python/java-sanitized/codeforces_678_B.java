import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isLeap = isLeapYear(y);
        int weekDay = getWeekDay(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeapYear(y) == isLeap && getWeekDay(y, 1, 1) == weekDay) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}