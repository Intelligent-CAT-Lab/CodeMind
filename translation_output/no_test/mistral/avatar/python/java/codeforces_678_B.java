<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = Calendar.getInstance().isLeap(y);
        int week = Calendar.getInstance().get(Calendar.FRIDAY);
        while (true) {
            y++;
            if (Calendar.getInstance().isLeap(y) == is_run && Calendar.getInstance().get(Calendar.FRIDAY) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```</s>
