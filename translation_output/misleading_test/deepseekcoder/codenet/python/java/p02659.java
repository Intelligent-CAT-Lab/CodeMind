<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
198 1.10

Expected output:
222

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
Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf((long) (1e9 + 7));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next());
        BigDecimal B = new BigDecimal(sc.next());
        System.out.println(A.multiply(B).toBigInteger());
    }
}
```

This Java code reads two decimal numbers from the standard input, multiplies them together, and prints the result. The multiplication is performed using the BigDecimal class, which allows for arbitrary-precision decimal numbers. The result is then converted to a BigInteger for output.
<|EOT|>
