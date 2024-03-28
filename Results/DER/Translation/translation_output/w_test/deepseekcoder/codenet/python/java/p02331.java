<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final long MOD = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(powMod(k, n));
    }

    static long powMod(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b = b / 2;
        }
        return res;
    }
}
```

This Java code reads two long integers from the standard input, calculates the power of the second number modulo MOD (10^9 + 7) and prints the result. The `powMod` function implements the exponentiation by squaring algorithm, which is an efficient way to calculate the power of a number modulo another number.
<|EOT|>
