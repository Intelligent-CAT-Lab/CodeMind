Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
#!/usr/bin/env python3
import sys
from math import *
from itertools import *
from collections import *
from functools import *
from operator import *
try:
    from math import gcd
except Exception:
    from fractions import gcd

MOD = 1000000007  # type: int

def solve(N: int, K: int):
    ns = []
    for i in range(1, N + 1):
        if N < i * i:
            break
        ns.append(i)
        ns.append(N // i)
    ns = sorted(list(set(ns)))

    m = {n: i for i, n in enumerate(ns)}
    l = [1] * len(ns)
    for i, (s, b) in enumerate(zip(ns, ns[1:])):
        l[i] = (N // s) - (N // b)

    dp = [[0] * len(ns) for _ in range(K+1)]
    dp[0][m[N]] = 1

    for i in range(K):
        for j in range(len(ns) - 2, -1, -1):
            dp[i][j] += dp[i][j + 1]
        for j, nn in enumerate(ns):
            nj = m[N // nn]
            dp[i+1][j] = (dp[i+1][j] + dp[i][nj] * l[j]) % MOD

    return sum(dp[-1]) % MOD


def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))  # type: int
    K = int(next(tokens))  # type: int
    result = solve(N, K)
    print(result)

if __name__ == '__main__':
    main()
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = solve(N, K);
        System.out.println(result);
    }

    public static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            ns.add(i);
            if (N % i == 0) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            int s = ns.get(i);
            int b = ns.get(i + 1);
            l[i] = (N / s) - (N / b);
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;
        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j + 1]) % MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = N / ns.get(j);
                int nj = m.get(nn);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int sum = 0;
        for (int i = 0; i < ns.size(); i++) {
            sum = (sum + dp[K][i]) % MOD;
        }
        return sum;
    }
}
```<|endoftext|>
