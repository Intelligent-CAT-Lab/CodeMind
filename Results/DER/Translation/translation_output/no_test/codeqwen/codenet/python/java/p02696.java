Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        double result = A * Math.min(B - 1, N) / (double) B;
        System.out.println((int) Math.floor(result));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the result, and prints the floor of the result. The `Math.floor` function in Java returns the largest integer less than or equal to the specified double value. The `Math.min` function returns the smaller of two double values. The `(int)` cast is used to convert the result to an integer before printing.
