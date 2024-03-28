Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 3

Expected output:
1 2 3

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
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        int[] A = new int[N];
        Arrays.fill(A, S);
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
```<|endoftext|>
