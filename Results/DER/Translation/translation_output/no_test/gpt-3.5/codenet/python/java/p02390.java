```java
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ss = input.nextInt();

        int hour = ss / (60 * 60);
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;

        System.out.printf("%d:%d:%d%n", hour, minute, second);
    }
}
```
