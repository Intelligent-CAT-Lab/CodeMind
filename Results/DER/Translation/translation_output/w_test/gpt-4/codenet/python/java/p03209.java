Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    private static final long INF = (long)1e18;
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long X = scanner.nextLong();

        long[] l = new long[51];
        long[] p = new long[51];
        l[0] = 1;
        p[0] = 1;

        for (int i = 1; i <= 50; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        long ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans += 1;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Make sure you compile and run this Java code in an appropriate environment that can read input from the console. The `Scanner` in Java is used for reading input, and we do not have access to the faster input mechanisms of Python's `sys.stdin`. I've also changed the recursion limit and INF value to long constants, assuming they're for controlling the flow rather than actually being used (since these Python specifics do not apply in Java).
