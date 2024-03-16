import java.util.Scanner;
import java.util.Calendar;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = Calendar.getInstance().isLeap(y);
        int week = Calendar.getInstance().get(Calendar.FRIDAY);
        while (true) {
            y++;
            if (Calendar.getInstance().isLeap(y) == is_run && Calendar.getInstance().get(Calendar.FRIDAY) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}