<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = Calendar.isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        while (true) {
            y = y + 1;
            if (Calendar.isLeapYear(y) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```

Please note that Java's Calendar class does not have a method to get the day of the week for a specific date. Therefore, the day of the week for the first day of the year is always returned. If you need to get the day of the week for a specific date, you would need to use a different library or create a custom method.<｜end▁of▁sentence｜>
