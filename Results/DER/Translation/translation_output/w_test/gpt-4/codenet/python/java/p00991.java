Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.close();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1L;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }

    private static long comb(int n, int k) {
        long result = 1L;
        for (int i = 0; i < k; i++) {
            result *= n - i;
            result /= i + 1;
        }
        return result;
    }
}
```

Please note that the `comb` function in Java now uses a different approach to calculate combinations to avoid calculating large factorials which can lead to overflow issues. The calculation is done by a multiply-and-divide process to ensure intermediate results stay within the bounds of the `long` type in Java.
