Here's how you might translate the provided Python code into Java:

```java
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isRun = isLeapYear(y);
        int week = getDayOfWeek(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeapYear(y) == isRun && getDayOfWeek(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // In Java Calendar, January is 0
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
```

Explanation:

1. I have used `java.util.Calendar` and `java.util.Scanner` to replace the Python `calendar` module and `input()` function.
2. The `isLeapYear` function is implemented to calculate leap years instead of using `calendar.isleap`.
3. The `getDayOfWeek` function is implemented to get the day of the week instead of using `calendar.weekday`. Note that Java's `Calendar` class requires month values starting from 0 for January, hence the `month - 1`.
4. The rest of the program is a direct translation from Python to Java, but with adjustments made for syntax and language-specific conventions.
