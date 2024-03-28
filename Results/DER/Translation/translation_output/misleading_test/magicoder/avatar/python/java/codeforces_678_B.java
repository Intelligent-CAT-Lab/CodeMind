<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2096

Expected output:
2074

```
import calendar
y = int ( input ( ) )
is_run = calendar . isleap ( y )
week = calendar . weekday ( y , 1 , 1 )
while True :
    y = y + 1
    if calendar . isleap ( y ) == is_run and calendar . weekday ( y , 1 , 1 ) == week :
        print ( y )
        break


```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = isLeap(y);
        int week = getWeekday(y, 1, 1);
        while (true) {
            y = y + 1;
            if (isLeap(y) == is_run && getWeekday(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        return cal.isLeapYear(year);
    }

    private static int getWeekday(int year, int month, int day) {
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}
```

This Java code does the same thing as the Python code. It checks if the next year is a leap year and the day of the week of January 1st of that year is the same as the day of the week of January 1st of the input year. If it is, it prints the next year and breaks the loop.<｜end▁of▁sentence｜>
