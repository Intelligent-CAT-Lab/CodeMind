Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
is_run = calendar. isleap ( y )
week = calendar. weekday ( y, 1, 1 )
while True :
    y = y + 1
    if calendar. isleap ( y ) == is_run and calendar. weekday ( y, 1, 1 ) == week :
        print ( y )
        break


```

### Response:
```java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = isLeap(year);
        int weekDay = getWeekDay(year, 1, 1);
        int nextYear = year;
        while (true) {
            nextYear++;
            if (isLeap(nextYear) == isLeapYear && getWeekDay(nextYear, 1, 1) == weekDay) {
                System.out.println(nextYear);
                break;
            }
        }
    }

    private static boolean isLeap(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    private static int getWeekDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
```<|endoftext|>
