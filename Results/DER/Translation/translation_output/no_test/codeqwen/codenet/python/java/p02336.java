Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
        }
        ans %= 1000000007;
        System.out.println(ans);
    }
}
```

Please note that in Java, we use `long` instead of `int` for large numbers. Also, Java does not have a built-in function for integer division, so we use `ans /= i` instead of `ans //= i`.
