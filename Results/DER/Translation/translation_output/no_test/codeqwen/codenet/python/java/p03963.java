Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * (k - 1) * (int) Math.pow(n - 1, n - 2));
    }
}
```

In this Java code, we use `Scanner` to read the input from the user. The `Math.pow` function is used to calculate the power of `(n-1)`. We cast the result to an `int` because the result of `Math.pow` is a `double`.
