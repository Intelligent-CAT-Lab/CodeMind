<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
3 5 7 11 31


```
import sys
import math
import collections
import bisect
import itertools

# import numpy as np

sys.setrecursionlimit(10 ** 7)
INF = 10 ** 16
MOD = 10 ** 9 + 7
# MOD = 998244353

ni = lambda: int(sys.stdin.readline().rstrip())
ns = lambda: map(int, sys.stdin.readline().rstrip().split())
na = lambda: list(map(int, sys.stdin.readline().rstrip().split()))
na1 = lambda: list(map(lambda x: int(x) - 1, sys.stdin.readline().rstrip().split()))


# ===CODE===

def main():
    # Nä»¥ä¸ã®ç´ æ°åæ
    def make_prime_nums(n):
        prime_nums = [2 if n >= 2 else None]
        for i in range(3, n + 1):
            for p in prime_nums:
                if p >= int(i ** (1 / 2)) + 1:
                    prime_nums.append(i)
                    break
                if i % p == 0:
                    break
        return prime_nums

    n = ni()
    p = make_prime_nums(2000)

    ans = []
    for pi in p:
        if pi % 10 == 1:
            ans.append(pi)
        if len(ans) == n:
            break

    print(*ans, sep=" ")



if __name__ == '__main__':
    main()

```
[/INST]
```java
import java.util.*;

public class Main {
    static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        primeNums.add(2);
        for (int i = 3; i <= n; i++) {
            for (int p : primeNums) {
                if (p >= Math.sqrt(i) + 1) {
                    primeNums.add(i);
                    break;
                }
                if (i % p == 0) {
                    break;
                }
            }
        }
        return primeNums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = makePrimeNums(2000);

        List<Integer> ans = new ArrayList<>();
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        System.out.println(ans.stream().mapToInt(i -> i).toArray());
    }
}
```</s>
