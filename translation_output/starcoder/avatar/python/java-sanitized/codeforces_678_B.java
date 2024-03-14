import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean is_run = Calendar.getInstance().isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            if (Calendar.getInstance().isLeapYear(y) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}