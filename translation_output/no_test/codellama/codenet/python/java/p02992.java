<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns.add(i);
            ns.add(N / i);
        }
        ns = ns.stream().distinct().sorted().collect(Collectors.toList());

        int[] m = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            m[i] = ns.get(i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size(); i++) {
            l[i] = (N / ns.get(i)) - (N / ns.get(i + 1));
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m[N]] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = ns.get(j);
                int nj = m[N / nn];
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int result = 0;
        for (int i = 0; i < ns.size(); i++) {
            result += dp[K][i];
        }
        System.out.println(result % MOD);
    }
}
```
This is the Java code for the given Python code.

The code first reads the input from the user, and then it initializes the `ns` list with the values of `i` from 1 to `N`, and then it adds `N / i` to the list.

The `ns` list is then sorted and converted to a set to remove duplicates.

The `m` array is initialized with the values of `ns` and the `l` array is initialized with the values of `(N / ns[i]) - (N / ns[i + 1])` for each `i`.

The `dp` array is initialized with the values of `0` for each `i` and `j`.

The code then iterates over the `K` values and updates the `dp` array using the formula provided in the Python code.

Finally, the code calculates the result by summing the values of `dp[K][i]` for each `i`.

Note that the code uses the `MOD` constant to perform the modulo operation.</s>
