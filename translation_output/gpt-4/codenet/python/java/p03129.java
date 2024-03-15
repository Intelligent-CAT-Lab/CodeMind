Below is the Java translation of the given Python code, which reads two integers `N` and `K` from standard input, and then outputs "YES" if `K` is less than or equal to half of `N` (rounded up), otherwise it outputs "NO". Please note in Java, we use `Scanner` to read input from the console and we must declare variable types.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integers N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Calculate half of N rounded up
        int halfN = (N + 1) / 2;

        // Check if K is less than or equal to halfN
        if (K <= halfN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

In this Java code, the `Scanner` class is responsible for reading input from the console. As always, after using a `Scanner`, it is recommended to close it by calling `scanner.close()` in order to free system resources associated with it. The division operator in Java automatically floors the result when dividing two integers, so to achieve the Python-like behavior of rounding up, we add 1 to `N` before dividing it by 2.
