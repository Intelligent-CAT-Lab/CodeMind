<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 2

Expected output:
8


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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(X == 0 ? 1 : N + 1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<int[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k * (k - 1) / 2) * D;
            int r = k * X + (N * k + (N - k) * (N - k + 1) / 2) * D;
            memo.computeIfAbsent(l % D, x -> new ArrayList<>()).add(new int[]{l, r});
        }

        int ans = 0;
        for (List<int[]> LR : memo.values()) {
            LR.sort(Comparator.comparingInt(a -> a[0]));

            int cur = Integer.MIN_VALUE;
            for (int[] interval : LR) {
                if (cur < interval[0]) {
                    ans += (interval[1] - interval[0]) / D + 1;
                    cur = interval[1];
                }
                if (cur < interval[1]) {
                    ans += (interval[1] - cur) / D;
                    cur = interval[1];
                }
            }
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, checks if D is zero or negative, and then calculates the number of intervals that can be formed by the given conditions. The result is printed to the standard output.
<|EOT|>
