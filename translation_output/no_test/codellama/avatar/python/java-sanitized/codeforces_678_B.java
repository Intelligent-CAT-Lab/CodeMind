import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = Calendar.isLeapYear(year);
        int week = Calendar.getWeekday(year, 1, 1);
        while (true) {
            year++;
            if (Calendar.isLeapYear(year) == isLeapYear && Calendar.getWeekday(year, 1, 1) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}