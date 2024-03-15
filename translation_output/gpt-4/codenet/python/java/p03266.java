Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long ans = 0;

        if (k % 2 == 1) {
            ans = (long) Math.pow(n / k, 3);
        } else {
            ans = (long) Math.pow(n / k, 3) + (long) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
}
```

Remember that Java is strictly typed, so you need to define your variables with their types, and when performing division, Java automatically performs integer division if both operands are integers (as in Python). The `**` operator in Python is equivalent to `Math.pow()` in Java, but be careful with types: `Math.pow()` returns a `double` and we need a `long` to prevent overflow, so you need an explicit cast to `long`. Also, you need to close the scanner to prevent resource leaks.
