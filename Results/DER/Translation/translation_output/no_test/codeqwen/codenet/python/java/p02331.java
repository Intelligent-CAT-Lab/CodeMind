Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((int) Math.pow(k, n) % 1000000007);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates `k ** n` (which is equivalent to `Math.pow(k, n)` in Java), and then prints the result modulo 1000000007. The `Math.pow` function in Java returns a double, so we cast the result to an integer before printing it.
