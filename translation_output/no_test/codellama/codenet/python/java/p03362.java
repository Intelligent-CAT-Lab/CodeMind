<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] primeNums = new int[2000];
        primeNums[0] = 2;
        for (int i = 3; i <= 2000; i++) {
            for (int j = 0; j < primeNums.length; j++) {
                if (primeNums[j] >= Math.sqrt(i) + 1) {
                    primeNums[j] = i;
                    break;
                }
                if (i % primeNums[j] == 0) {
                    break;
                }
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < primeNums.length; i++) {
            if (primeNums[i] % 10 == 1) {
                ans[i] = primeNums[i];
            }
            if (ans.length == n) {
                break;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
This is a Java implementation of the Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `primeNums` array is initialized with the first 2000 prime numbers, and the `ans` array is initialized with the first `n` prime numbers that end in 1. The `for` loop iterates over the `primeNums` array and checks if each number ends in 1, and if it does, it adds it to the `ans` array. Finally, the `ans` array is printed to the console.</s>
