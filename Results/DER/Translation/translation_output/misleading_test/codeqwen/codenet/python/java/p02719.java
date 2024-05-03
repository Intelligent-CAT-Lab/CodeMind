Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int rot = n / k;
        int x = n;

        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }

        int t = x % k;

        System.out.println(Math.min(t, Math.abs(t - k)));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, performs the same calculations as the Python code, and prints the result. The `Math.min` and `Math.abs` functions are used to find the minimum of two numbers, and the absolute value of a number, respectively.
