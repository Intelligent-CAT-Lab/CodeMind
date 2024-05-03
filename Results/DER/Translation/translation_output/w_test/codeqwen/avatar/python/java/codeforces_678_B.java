Here is the Java equivalent of the Python code you provided:

```java
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int y = Integer.parseInt(System.console().readLine());
        boolean isRun = Calendar.getInstance().get(Calendar.YEAR) % 4 == 0;
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            Calendar cal = Calendar.getInstance();
            cal.set(y, 0, 1);
            if (cal.get(Calendar.YEAR) % 4 == 0 == isRun && cal.get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the console, checks if the year is a leap year and the first day of the year is on the same day of the week, and then prints the next year that satisfies these conditions.
