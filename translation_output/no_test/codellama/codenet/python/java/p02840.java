<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            memo.put(l % D, new ArrayList<>());
            memo.get(l % D).add(l);
            memo.get(l % D).add(r);
        }

        int ans = 0;
        for (List<Integer> LR : memo.values()) {
            LR.sort(Integer::compareTo);

            int cur = -1;
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
This is the Java code for the given Python code. It uses the same logic and data structures as the Python code, but with Java syntax. The `Scanner` class is used to read input from the user, and the `HashMap` class is used to store the memoization data. The `ArrayList` class is used to store the list of values for each key in the memoization data. The `sort` method is used to sort the list of values for each key, and the `compareTo` method is used to compare the values. The `System.out.println` method is used to print the final answer.</s>
