Here is the Python code converted to Java, which takes user input from the console and converts seconds into hours, minutes, and seconds:

```java
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int remainder = ss % (60 * 60);
        int minute = remainder / 60;
        int second = remainder % 60;
        System.out.printf("%d:%d:%d\n", hour, minute, second);
    }
}
```

To test it with the provided test input `46979`, run the program and when it's waiting for input, enter `46979`. The expected output will be `13:2:59`. Make sure to provide the input without quotes and to press enter after typing in the number.
