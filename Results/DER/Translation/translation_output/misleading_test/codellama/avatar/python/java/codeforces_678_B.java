<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = Calendar.isLeapYear(year);
        int week = Calendar.getWeekday(year, 1, 1);
        while (true) {
            year++;
            if (Calendar.isLeapYear(year) == isLeap && Calendar.getWeekday(year, 1, 1) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}
```
This code uses the `Calendar` class to determine if a year is a leap year and to get the weekday of a specific date. It then uses a `while` loop to iterate through the years and find the first year that matches the specified conditions. The `break` statement is used to exit the loop when the first matching year is found.

Note that the `Calendar` class is a part of the `java.util` package, so you need to import it in your code.

Also, the `Scanner` class is used to read the input from the user, and the `System.out.println()` method is used to print the output.</s>
