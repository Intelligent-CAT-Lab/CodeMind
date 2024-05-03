Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        int result = (int) Math.floor((double) A * Math.min(B - 1, N) / B);
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the result, and prints it out. The `Math.floor` function is used to round down the result to the nearest whole number. The `(double)` cast is used to ensure that the division is performed as floating-point division, which is necessary to get the correct result when the denominator is less than 1.
