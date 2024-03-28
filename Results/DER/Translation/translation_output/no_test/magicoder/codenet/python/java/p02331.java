<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long MOD = 1000000000 + 7;
        System.out.println(modPow(k, n, MOD));
    }

    static long modPow(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % mod;
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the power of `k` to the `n` modulo `MOD`, and prints the result. The `modPow` function is a modified version of the exponentiation by squaring algorithm, which is used to calculate the power of a number modulo another number efficiently.<｜end▁of▁sentence｜>
