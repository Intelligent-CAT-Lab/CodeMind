Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        System.out.println(Math.ceil((double) h / a));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, divides the first by the second, and then rounds up the result to the nearest whole number. The `Math.ceil` function in Java does the same thing as `math.ceil` in Python. The `(double)` cast is necessary to ensure that the division is done as floating-point division, rather than integer division.
