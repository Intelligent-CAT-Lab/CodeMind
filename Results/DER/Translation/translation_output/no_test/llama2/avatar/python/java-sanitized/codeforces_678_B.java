import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean is_run = Calendar.isLeapYear(y);
        int week = Calendar.get(Calendar.DAY_OF_WEEK, y, 1, 1);
        while (true) {
            y++;
            if (Calendar.isLeapYear(y) == is_run && Calendar.get(Calendar.DAY_OF_WEEK, y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}