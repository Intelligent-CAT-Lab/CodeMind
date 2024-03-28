Here's the translated Java code for the Python code provided:

```java
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        int qq = y1 / 400;
        y1 = y1 % 400 + 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);
        LocalDate d = LocalDate.of(y1, m1, d1);

        while (!d.isAfter(LocalDate.of(y2, m2, d2))) {
            if (d.getDayOfMonth() == 13 && d.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            d = d.plusDays(1);
        }

        System.out.println(a);
    }
}
```

You can compile and run this Java code, and it will behave similarly to the original Python code, computing the specified output. Please note that Java's `LocalDate.getDayOfWeek().getValue()` returns a value from 1 (Monday) to 7 (Sunday), so for Friday we compare it to 5, unlike Python's `weekday()` which returns 0 (Monday) to 6 (Sunday).

Please use this Java version with the provided test input to get the expected result.
