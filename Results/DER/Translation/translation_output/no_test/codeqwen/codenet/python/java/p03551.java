Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the time, and then prints the result. The `Math.pow` function is used to calculate the power of 2. The `(int)` cast is used to convert the result of `Math.pow` to an integer, as Java does not support floating-point exponents.
