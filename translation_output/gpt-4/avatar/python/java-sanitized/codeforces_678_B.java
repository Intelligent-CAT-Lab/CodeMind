import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = new GregorianCalendar().isLeapYear(y);
        Calendar cal = Calendar.getInstance();
        cal.set(y, Calendar.JANUARY, 1);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        
        while (true) {
            y = y + 1;
            boolean currentYearIsLeap = new GregorianCalendar().isLeapYear(y);
            cal.set(y, Calendar.JANUARY, 1);
            int currentWeek = cal.get(Calendar.DAY_OF_WEEK);
            
            if (currentYearIsLeap == is_run && currentWeek == week) {
                System.out.println(y);
                break;
            }
        }
        
        scanner.close();
    }
}