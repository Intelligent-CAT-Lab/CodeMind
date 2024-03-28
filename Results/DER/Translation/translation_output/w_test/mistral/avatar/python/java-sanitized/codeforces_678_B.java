import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = isLeap(y);
        int week = getWeekday(y, 1, 1);
        while (true) {
            y++;
            if (isLeap(y) == is_run && getWeekday(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    public static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 != 0) {
            return false;
        }
        return true;
    }

    public static int getWeekday(int year, int month, int day) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (isLeap(year)) {
                days[1] = 29;
            } else {
                days[1] = 28;
            }
        }
        int totalDays = 0;
        for (int i = 1; i <= month; i++) {
            totalDays += days[i];
        }
        totalDays += day - 1;
        int weekday = totalDays % 7;
        return weekday;
    }
}