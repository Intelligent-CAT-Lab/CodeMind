import java.util.Scanner;
import java.util.Calendar;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = Calendar.isLeapYear(year);
        int week = Calendar.getWeekday(year, 1, 1);
        while (true) {
            year++;
            if (Calendar.isLeapYear(year) == isLeap && Calendar.getWeekday(year, 1, 1) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}