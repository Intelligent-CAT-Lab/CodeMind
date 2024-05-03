Here is the Java version of your Python code:

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int y1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int d1 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int m2 = Integer.parseInt(input[4]);
        int d2 = Integer.parseInt(input[5]);

        int qq = y1 / 400;
        y1 += 400;
        qq -= 1;
        int q = (y2 - y1) / 400;
        y2 -= 400 * q;
        int a = 688 * (q - qq);

        LocalDate d = LocalDate.of(y1, m1, d1);
        while (!d.isAfter(LocalDate.of(y2, m2, d2))) {
            if (d.getDayOfMonth() == 13 && d.getDayOfWeek().getValue() == 5) {
                a += 1;
            }
            d = d.plus(1, ChronoUnit.DAYS);
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the console, parses it into integers, calculates the number of 13th Fridays between the two dates, and prints the result.
