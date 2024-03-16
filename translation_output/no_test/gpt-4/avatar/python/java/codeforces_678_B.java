Here is the translated Java code that performs the same function as the given Python code:

```java
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Main {
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
```

Explanation:
- We use `Scanner` to read the input from the user as Java doesn't have a direct equivalent to Python's `input()`.
- We use `GregorianCalendar().isLeapYear(int year)` to determine if a year is a leap year.
- Java's `Calendar` class is used to obtain the weekday of the first day of the year.
- The `while` loop continues until a year is found that has the same leap year status and the same weekday on January 1 as the original year.
