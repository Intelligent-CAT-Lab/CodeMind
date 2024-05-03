Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (ok(m, n, k)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    public static boolean ok(int m, int n, int k) {
        int s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) {
                return false;
            }
            if (cnt == n) {
                break;
            }
            m >>= 1;
        }
        return true;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers `n` and `k` from the standard input, then it uses a binary search to find the largest integer `m` such that `ok(m)` is true. The `ok` function checks if the sum of `m` and all previous integers is less than or equal to `k` and if `m` is less than or equal to `n`. If `ok(m)` is true, it means that `m` is a valid answer, so it updates `l` to `m`. Otherwise, it updates `r` to `m`. Finally, it prints the value of `l`, which is the largest integer `m` such that `ok(m)` is true.
