import java.util.Calendar;
import java.util.Scanner;
public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeap = Calendar.getInstance().isLeapYear(year);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            year++;
            if (Calendar.getInstance().isLeapYear(year) == isLeap && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}