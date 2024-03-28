<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

import calendar
y = int ( input ( ) )
is_run = calendar . isleap ( y )
week = calendar . weekday ( y , 1 , 1 )
while True :
    y = y + 1
    if calendar . isleap ( y ) == is_run and calendar . weekday ( y , 1 , 1 ) == week :
        print ( y )
        break



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = Calendar.isLeapYear(year);
        int week = Calendar.getWeekday(year, 1, 1);
        while (true) {
            year++;
            if (Calendar.isLeapYear(year) == isLeapYear && Calendar.getWeekday(year, 1, 1) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}
```
Note that the `Calendar` class in Java is used to determine whether a year is a leap year and to get the weekday of a date. The `Scanner` class is used to read input from the user.</s>
