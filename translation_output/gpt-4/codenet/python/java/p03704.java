Below is the translation of the given Python code into Java. The code defines a recursive method `f()` and then calculates a sum based on the function's output, similar to the behavior in the Python code.

```java
import java.util.Scanner;

public class Main {
    
    public static long f(long d, int x, int y) {
        long n = Long.parseLong(new String(new char[x]).replace("\0", "9") + new String(new char[y]).replace("\0", "0"));
        if (x < 1) return d == 0 ? 1 : 0;
        long sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long D = Long.parseLong(scanner.nextLine());
        long totalSum = 0;
        for (int i = 1; i <= 20; i++) {
            totalSum += f(D, i, 0) * (10 - (i % 2) * 9);
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
```

When running this program, it will expect input from the user identical to the Python program. The user needs to input a value for `D`, and then it will output the sum calculation result. Please note that transforming Python dynamic typing and list comprehensions to Java's strict typing and loops requires careful consideration of types and iterations.
