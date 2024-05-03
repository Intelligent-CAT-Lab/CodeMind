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

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the binary representation of the second integer, and then uses a binary search to find the largest integer that satisfies the condition of the function `ok`. The function `ok` checks if the sum of the binary representation of the integer `m` is less than or equal to `k` and if the number of bits in the binary representation of `m` is less than or equal to `n`. If `m` satisfies both conditions, it returns `true`; otherwise, it returns `false`. The main function uses a binary search to find the largest integer that satisfies the condition of the function `ok`.
