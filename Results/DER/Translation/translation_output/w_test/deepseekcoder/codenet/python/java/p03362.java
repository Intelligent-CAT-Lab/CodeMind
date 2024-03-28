<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primes = makePrimeNumbers(2000);
        List<Integer> ans = new ArrayList<>();
        for (int prime : primes) {
            if (prime % 10 == 1) {
                ans.add(prime);
            }
            if (ans.size() == n) {
                break;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + (i == ans.size() - 1 ? "\n" : " "));
        }
    }

    private static List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNumbers) {
                if (p > Math.sqrt(i)) {
                    break;
                }
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
```

This Java code does the same thing as your Python code. It generates the first `n` prime numbers that end with `1`, where `n` is the input from the user. The `makePrimeNumbers` method generates all prime numbers up to `n`, and the `main` method filters out the ones that end with `1`. The results are then printed to the console.
<|EOT|>
