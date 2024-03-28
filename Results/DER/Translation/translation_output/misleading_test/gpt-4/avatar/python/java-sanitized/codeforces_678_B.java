import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        scanner.close();

        boolean isRun = isLeapYear(y);
        int week = getFirstDayOfWeek(y);
        
        while (true) {
            y += 1;
            if (isLeapYear(y) == isRun && getFirstDayOfWeek(y) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    private static int getFirstDayOfWeek(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}