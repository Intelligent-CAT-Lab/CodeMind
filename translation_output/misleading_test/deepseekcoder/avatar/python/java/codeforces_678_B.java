<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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
        int week = getWeekDay(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeap(y) == is_run && getWeekDay(y, 1, 1) == week) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
```

This Java code does the same thing as the Python code. It checks if the next year is a leap year and has the same first day of the week as the input year. If it is, it prints the next year.

Please note that in Java, the `Calendar.DAY_OF_WEEK` starts from 1 (Sunday) to 7 (Saturday), while in Python, it starts from 0 (Monday) to 6 (Sunday). So, the result of `Calendar.DAY_OF_WEEK` in Java is equivalent to the result of `calendar.weekday()` in Python.
<|EOT|>
