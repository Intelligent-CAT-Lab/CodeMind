Here is the translated Java code for the given Python script:

```java
import java.util.Scanner;

public class TimeConversion {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();

        int hour = ss / (60 * 60);
        int remainingSeconds = ss % (60 * 60);
        int minute = remainingSeconds / 60;
        int second = remainingSeconds % 60;

        System.out.printf("%d:%d:%d%n", hour, minute, second);
    }
}
```

When you run the Java program, you should input `46979` and it will give you the expected output of `13:3:19`. Note that the output might look slightly different from Python's output in terms of the number of digits displayed. If you need to match the Python's `print` format, you might want to modify the `printf` method to ensure that it always prints two digits for minutes and seconds:

```java
System.out.printf("%d:%02d:%02d%n", hour, minute, second);
```

With this modification, the output will be `13:03:19` for the input `46979`.
