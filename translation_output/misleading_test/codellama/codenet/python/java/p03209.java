<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 7

Expected output:
-71

```
import sys
import itertools
# import numpy as np
import time
import math
import heapq
from collections import defaultdict
sys.setrecursionlimit(10 ** 7)
 
INF = 10 ** 18
MOD = 10 ** 9 + 7
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

# map(int, input().split())

N, X = map(int, input().split())

l = [0] * 51
l[0] = 1
p = [0] * 51
p[0] = 1
for i in range(1, 51):
    l[i] = l[i - 1] * 2 + 3
    p[i] = p[i - 1] * 2 + 1

ans = 0
for i in range(N, -1, -1):
    if i == 0 and X >= 1:
        ans += 1
        break

    if X <= 1:
        break
    elif X <= l[i - 1] + 1:
        X -= 1
        continue 
    elif X == l[i - 1] + 2:
        ans += 1
        X -= 2
    else:
        ans += p[i - 1] + 1
        X -= l[i - 1] + 2
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        int[] l = new int[51];
        int[] p = new int[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        int ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans += 1;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X -= 1;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans += 1;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }

        System.out.println(ans);
    }
}
```
This is the Java code for the given Python code. The code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `for` loop is used to iterate over the input values, and the `if` statements are used to perform the necessary calculations. The `l` and `p` arrays are used to store the values of the `l` and `p` variables from the Python code. The `ans` variable is used to store the final result.</s>
