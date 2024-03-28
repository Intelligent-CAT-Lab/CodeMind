import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = isLeap(year);
        int weekDay = getWeekDay(year, 1, 1);
        int nextYear = year;
        while (true) {
            nextYear++;
            if (isLeap(nextYear) == isLeapYear && getWeekDay(nextYear, 1, 1) == weekDay) {
                System.out.println(nextYear);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}