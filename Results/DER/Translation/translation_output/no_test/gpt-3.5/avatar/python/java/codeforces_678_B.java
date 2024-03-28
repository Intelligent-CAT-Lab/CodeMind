```java
import java.util.Calendar;

public class LeapYearFinder {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isLeap = isLeapYear(y, calendar);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        
        while (true) {
            y++;
            if (isLeapYear(y, calendar) == isLeap && calendar.get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year, Calendar calendar) {
        return calendar.isLeapYear(year);
    }
}
```
