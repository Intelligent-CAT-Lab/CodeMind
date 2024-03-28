Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeap = Calendar.getInstance().isLeapYear(year);
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int daysInYear = isLeap? 366 : 365;
        int daysPassed = 0;
        for (int i = 1; i <= daysInYear; i++) {
            if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == weekday) {
                daysPassed++;
                if (daysPassed == 7) {
                    System.out.println(year);
                    break;
                }
            }
            Calendar.getInstance().add(Calendar.DAY_OF_YEAR, 1);
        }
    }
}
```<|endoftext|>
