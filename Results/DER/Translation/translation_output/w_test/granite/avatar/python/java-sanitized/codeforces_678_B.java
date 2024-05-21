import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isRun = Calendar.getInstance().isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            if (Calendar.getInstance().isLeapYear(y) == isRun && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}