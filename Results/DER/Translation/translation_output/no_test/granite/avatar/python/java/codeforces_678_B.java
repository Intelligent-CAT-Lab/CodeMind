System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Calendar;
import java.util.Scanner;

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
```<|endoftext|>
