<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
20

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
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long MOD = 1000000007;
        long result = (long) Math.pow(k, n) % MOD;

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the power of `k` to the `n` modulo `MOD`, and prints the result. The `Math.pow` method in Java returns a double, so we cast it to a long before taking the modulo.<｜end▁of▁sentence｜>
