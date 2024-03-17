<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
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

        System.out.println(Arrays.toString(A));
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Arrays` class to create and manipulate arrays. The code is similar to the Python code, with some minor differences in syntax and naming conventions.

The `main` method is the entry point of the program, and it reads the input from the user using the `Scanner` class. It then creates an array `A` of size `N` and fills it with the value `S`. If `S` is equal to `1000000000`, the code sets the first `N-K` elements of `A` to `S-1`, otherwise it sets them to `1000000000`. Finally, it prints the contents of `A` using the `Arrays.toString` method.

Note that the `Arrays.toString` method is used to convert the array to a string, which is then printed to the console. This is a more efficient way of printing the array than using a loop to print each element individually.</s>
