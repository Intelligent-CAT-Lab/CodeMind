Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -(t + 1);
        }
        boolean[] r = new boolean[t * 2];
        Arrays.fill(r, true);
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = !r[ti];
                r[ti - ts] = !r[ti - ts];
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (boolean b : r) {
            sb.append(b ? "(" : ")");
        }
        System.out.println(sb.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the values of the sequence `a`, and then uses binary search to find the index `t` such that `a[t] >= n`. It then creates a boolean array `r` of size `t * 2` and fills it with `true` values. It then iterates over the sequence `a` from `t` to `0`, and for each `i`, it checks if `n < a[t - i]`. If it is, it calculates `ts` as the minimum of `t` and `a[t - i] - n`, and then flips the
