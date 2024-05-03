Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        double v = (q - 1.0) / q;
        double tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println((int) tm);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the value of `v`, and then enters a loop that continues until the difference between `T - s` and `v * t` is less than 1e-10. In each iteration of the loop, it increments `tm`, adds `v * t` to `s`, and recalculates `t`. After the loop, it prints the value of `tm` as an integer.
