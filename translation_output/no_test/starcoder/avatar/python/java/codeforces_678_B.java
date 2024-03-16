<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean is_run = Calendar.getInstance().isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            if (Calendar.getInstance().isLeapYear(y) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```
<|endoftext|>
