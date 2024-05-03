Here is the Java equivalent of your Python code:

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

This Java code does the same thing as your Python code. It reads an integer from the console, checks if it's a leap year and the first day of the year is a certain day of the week, then it increments the year and checks again until it finds a year that satisfies both conditions. It then prints the year and breaks the loop.
