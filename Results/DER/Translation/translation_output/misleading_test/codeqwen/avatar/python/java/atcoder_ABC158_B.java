Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three long integers from the standard input, performs the same calculations as your Python code, and prints the result. The `Math.min` function is used to find the minimum of two long integers.
