Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = 0;

        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the answer, and prints it. The `Math.pow` function is used to calculate the power of a number. The `int` keyword is used to cast the result of the power operation to an integer, because Java does not support floating-point arithmetic by default.
