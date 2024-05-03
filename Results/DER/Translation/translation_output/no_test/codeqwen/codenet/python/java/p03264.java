Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int) Math.ceil((double) k / 2) * (k / 2));
    }
}
```

In Java, we use `Math.ceil()` to round up a floating point number to the nearest whole number. We also need to cast the result of `k / 2` to `double` before passing it to `Math.ceil()` to ensure that the division is performed as a floating point division. The result of the division is then cast back to `int` before being multiplied by `k / 2`.
