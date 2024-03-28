<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 3

Expected output:
1 2 3 4


```
from functools import reduce
from fractions import gcd
import math
import bisect
import itertools
import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline
INF = float("inf")


def main():
    N, K, S = map(int, input().split())
    
    A = [S]*N
    if S == 10**9:
        for i in range(N-K):
            A[i] = S - 1
    else:
        for i in range(N-K):
            A[i] = 10**9

    print(' '.join(map(str, A)))


if __name__ == '__main__':
    main()
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>(Collections.nCopies(N, S));
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A.set(i, S - 1);
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A.set(i, 1000000000);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A.get(i) + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, creates a list of these integers, and prints the list to the standard output. If the last integer is 10^9, it fills the first N-K elements of the list with 1 less than the last integer. Otherwise, it fills the first N-K elements of the list with 10^9.
<|EOT|>
