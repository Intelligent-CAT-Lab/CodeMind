<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primeNumbers = new int[2000];
        primeNumbers[0] = 2;
        for (int i = 3; i <= 2000; i++) {
            for (int j = 0; j < primeNumbers.length; j++) {
                if (primeNumbers[j] >= Math.sqrt(i) + 1) {
                    primeNumbers[j + 1] = i;
                    break;
                }
                if (i % primeNumbers[j] == 0) {
                    break;
                }
            }
        }

        int[] ans = new int[n];
        int count = 0;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] % 10 == 1) {
                ans[count++] = primeNumbers[i];
            }
            if (count == n) {
                break;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
This is a Java implementation of the Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `primeNumbers` array is initialized with the first 2000 prime numbers, and the `ans` array is initialized with the first `n` prime numbers that end in 1. The `count` variable is used to keep track of the number of prime numbers that have been found. The `for` loop iterates over the `primeNumbers` array and checks if each number ends in 1. If it does, it is added to the `ans` array and the `count` variable is incremented. The `for` loop continues until the `count` variable reaches `n`. Finally, the `ans` array is printed to the console.</s>
