Here is the Python code translated to Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double h = (double) x / (a * a);
        double ans;

        if (h >= b / 2.0) {
            double V = 2.0 * ((a * a * b) - x) / (a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = (a * (b * b)) / (2.0 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.println(ans);
    }
}
```

Note:
1. I've taken the liberty to convert the variables to the double type to preserve the floating-point arithmetic as it is in the Python code.
2. Math.atan() and Math.toDegrees() are used in place of math.atan() and math.degrees(), respectively.
3. Scanner is used to read the input values for a, b, and x in Java, which is a common way to handle user input.
