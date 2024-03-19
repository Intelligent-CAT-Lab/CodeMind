<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean is_run = Calendar.getInstance().isLeapYear(year);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            year++;
            if (Calendar.getInstance().isLeapYear(year) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(year);
                break;
            }
        }
    }
}
```
'''
<|endoftext|>
