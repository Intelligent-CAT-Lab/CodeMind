import java.util.Calendar;
import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeap = Calendar.getInstance().isLeapYear(year);
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int daysInYear = isLeap? 366 : 365;
        int daysPassed = 0;
        for (int i = 1; i <= daysInYear; i++) {
            if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == weekday) {
                daysPassed++;
                if (daysPassed == 7) {
                    System.out.println(year);
                    break;
                }
            }
            Calendar.getInstance().add(Calendar.DAY_OF_YEAR, 1);
        }
    }
}