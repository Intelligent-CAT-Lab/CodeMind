```java
import java.util.Calendar;

public class LeapYear {
    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        boolean isRun = isLeapYear(y);
        int week = dayOfWeek(y);

        while (true) {
            y++;
            if (isLeapYear(y) == isRun && dayOfWeek(y) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    public static int dayOfWeek(int year) {
         Calendar cal = Calendar.getInstance();
         cal.set(year, 0, 1);
         return cal.get(Calendar.DAY_OF_WEEK);
    }
}
```

