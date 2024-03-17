<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
9


```
#!/usr/bin/env python

import sys
import math
import itertools as it
from collections import deque

sys.setrecursionlimit(10000000)

MOD = 10 ** 9 + 7

n, k = map(int, raw_input().split())

print k ** n % MOD

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long MOD = 1000000007;
        System.out.println(modPow(k, n, MOD));
    }

    public static long modPow(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. We then calculate the power of `k` to the `n` using the `modPow` function. This function uses the binary exponentiation method to calculate the power in a more efficient way. The `&` operator is used to check if the exponent is odd or even, and the `>>` operator is used to right shift the exponent by 1 bit. The `%` operator is used to find the remainder when `base` is divided by `mod`.<｜end▁of▁sentence｜>
