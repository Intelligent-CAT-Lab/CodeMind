Sure, here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1, b = 1, i = 0;

        while (i < n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        System.out.println(a);
        scanner.close();
    }
}
```

The Java code uses a `Scanner` object to read the user input, which is the same as `input()` in Python. The tuple assignment in Python for `a` and `b` is replaced by using a temporary variable `temp` in Java since Java doesn't support tuple assignment natively. The `print` function is replaced by `System.out.println` in Java for output.
