<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import defaultdict

INF = float("inf")

N, X, D = map(int, input().split())

if D == 0:
    print(1 if X == 0 else N + 1)
    quit()

if D < 0:
    X, D = -X, -D

memo = defaultdict(list)
for k in range(N + 1):
    l = k * X + (k - 1) * k // 2 * D
    r = k * X + (N - k + N - 1) * k // 2 * D
    memo[l % D].append((l, r))

ans = 0
for LR in memo.values():
    LR.sort()

    cur = -INF
    for l, r in LR:
        if cur < l:
            ans += (r - l) // D + 1
            cur = r
        if cur < r:
            ans += (r - cur) // D
            cur = r

print(ans)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int D = in.nextInt();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<long[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            long l = k * X + (k * (k - 1) / 2) * D;
            long r = k * X + ((N - k + N) * k / 2) * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new long[]{l, r});
        }

        long ans = 0;
        for (List<long[]> LR : memo.values()) {
            LR.sort(Comparator.comparingLong(a -> a[0]));

            long cur = Long.MIN_VALUE;
            for (long[] lr : LR) {
                if (cur < lr[0]) {
                    ans += (lr[1] - lr[0]) / D + 1;
                    cur = lr[1];
                }
                if (cur < lr[1]) {
                    ans += (lr[1] - cur) / D;
                    cur = lr[1];
                }
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, checks if D is zero or negative, and then calculates the answer. The answer is printed to the standard output.
<|EOT|>
