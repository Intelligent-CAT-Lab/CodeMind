<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean isLeap = isLeapYear(y);
        int weekDay = getWeekDay(y, 1, 1);

        while (true) {
            y = y + 1;
            if (isLeapYear(y) == isLeap && getWeekDay(y, 1, 1) == weekDay) {
                System.out.println(y);
                break;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
```

This Java code does the same thing as the Python code. It checks if the next year is a leap year and has the same weekday as the input year. If it is, it prints the year and stops.

The `isLeapYear` method checks if a year is a leap year. The `getWeekDay` method returns the weekday of a specific date. The `main` method reads the input year, checks if the next year is a leap year and has the same weekday as the input year, and prints the year if it is.
<|EOT|>
