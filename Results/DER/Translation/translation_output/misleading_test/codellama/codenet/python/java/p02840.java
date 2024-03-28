<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 2

Expected output:
-50

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
[/INST]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int D = scanner.nextInt();

        if (D == 0) {
            System.out.println(1);
            return;
        }

        if (D < 0) {
            X = -X;
            D = -D;
        }

        Map<Integer, List<Integer>> memo = new HashMap<>();
        for (int k = 1; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.put(l % D, new ArrayList<>());
            memo.get(l % D).add(l);
            memo.get(l % D).add(r);
        }

        int ans = 0;
        for (List<Integer> LR : memo.values()) {
            LR.sort(Integer::compareTo);

            int cur = -1000000000;
            for (int i = 0; i < LR.size(); i++) {
                int l = LR.get(i);
                int r = LR.get(i + 1);
                if (cur < l) {
                    ans += (r - l) / D + 1;
                    cur = r;
                }
                if (cur < r) {
                    ans += (r - cur) / D;
                    cur = r;
                }
            }
        }

        System.out.println(ans);
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `Map` and `List` classes to store the memoization data. The `sort` method is used to sort the list of values in the memoization data, and the `compareTo` method is used to compare the values. The `Integer` class is used to perform integer arithmetic. The `System.out.println` method is used to print the final answer.</s>
