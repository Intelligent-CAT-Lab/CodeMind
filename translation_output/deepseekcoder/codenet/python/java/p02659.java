<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
import math
from collections import deque
from decimal import Decimal

sys.setrecursionlimit(1000000)
MOD = 10 ** 9 + 7
input = lambda: sys.stdin.readline().strip()
NI = lambda: int(input())
NMI = lambda: map(float, input().split())
NLI = lambda: list(NMI())
SI = lambda: input()


def make_grid(h, w, num): return [[int(num)] * w for _ in range(h)]


#é£æ¥ãªã¹ã 1-order
def make_adjlist_d(n, edges):
    res = [[] for _ in range(n + 1)]
    for edge in edges:
        res[edge[0]].append(edge[1])
        res[edge[1]].append(edge[0])
    return res


def make_adjlist_nond(n, edges):
    res = [[] for _ in range(n + 1)]
    for edge in edges:
        res[edge[0]].append(edge[1])
    return res


#nCr
def cmb(n, r):
    return math.factorial(n) // math.factorial(r) // math.factorial(n - r)


def main():
    A, B = input().split()
    print(int(Decimal(A) * Decimal(B)))


if __name__ == "__main__":
    main()
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = (int)Math.pow(10, 9) + 7;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String A = in.next();
        String B = in.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        System.out.println(a.multiply(b));
    }
}
```

This Java code does the same thing as the Python code. It reads two strings from the standard input, converts them to BigIntegers, multiplies them together, and prints the result.
<|EOT|>
