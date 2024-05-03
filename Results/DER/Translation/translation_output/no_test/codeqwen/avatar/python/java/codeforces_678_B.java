Here is the Java version of your Python code:

```java
import java.util.Calendar;

public class Main {
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
```

Please note that in Java, we use `Calendar.getInstance().isLeapYear(y)` to check if a year is a leap year, and `Calendar.getInstance().get(Calendar.DAY_OF_WEEK)` to get the day of the week. The `Calendar.DAY_OF_WEEK` constant returns an integer value where 1 is Sunday and 7 is Saturday.
