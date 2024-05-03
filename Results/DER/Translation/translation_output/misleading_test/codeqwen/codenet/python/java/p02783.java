Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println((int) Math.ceil((double) H / A));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, divides the first by the second, and then rounds up the result to the nearest whole number. The `Math.ceil` function in Java works similarly to the `math.ceil` function in Python. It rounds a floating-point number up to the nearest whole number. The `(double)` cast is necessary to ensure that the division is performed as floating-point division, rather than integer division. The `(int)` cast is then used to convert the result back to an integer.
