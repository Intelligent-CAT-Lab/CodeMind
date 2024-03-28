Below is the translated code from Python to Java. It might not be a direct one-to-one translation since Java and Python have different standard libraries and idioms.

```java
import java.util.Calendar;
import java.util.Scanner;

public class NextYearWithSameCharacteristics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        scanner.close();

        boolean isRun = isLeapYear(y);
        int week = getFirstDayOfWeek(y);
        
        while (true) {
            y += 1;
            if (isLeapYear(y) == isRun && getFirstDayOfWeek(y) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    private static int getFirstDayOfWeek(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
```

To test this Java code with the given input (2096) and verify that it produces the expected output (2074), you can run this program and input 2096 when prompted, and then check the output on the console.
