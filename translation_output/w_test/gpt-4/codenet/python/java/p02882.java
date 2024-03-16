Here's the equivalent Java code for the Python code provided:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double ans;
        double h = (double)x / (a * a);

        if (h >= (double)b / 2) {
            double V = 2 * ((a * a * b) - x) / (double)(a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = (double)(a * (b * b)) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.printf("%.10f\n", ans);

        scanner.close();
    }
}
```

This Java code reads in three integers `a`, `b`, and `x`, and then performs the same calculations that the Python code does to find the angle `ans`. It finally prints the angle with formatting to match the expected output precision.

Note: To run this code, make sure to place it inside a file named `Main.java` and compile with `javac Main.java`, then run with `java Main` in a console environment that allows standard input (like a terminal or command prompt).
