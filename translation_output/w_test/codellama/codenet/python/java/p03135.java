<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3

Expected output:
2.6666666667


```
#!/usr/bin/env python3

import sys
import math
from bisect import bisect_right as br
from bisect import bisect_left as bl
sys.setrecursionlimit(2147483647)
from heapq import heappush, heappop,heappushpop
from collections import defaultdict
from itertools import accumulate
from collections import Counter
from collections import deque
from operator import itemgetter
from itertools import permutations
mod = 10**9 + 7
inf = float('inf')
def I(): return int(sys.stdin.readline())
def LI(): return list(map(int,sys.stdin.readline().split()))

t,x = LI()
print(t/x)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(t / x);
    }
}
```
This is a simple Java program that reads two integers `t` and `x` from the standard input using the `Scanner` class, and then prints the result of dividing `t` by `x` to the standard output.

The `Scanner` class is used to read input from the standard input stream, and the `nextInt()` method is used to read the next integer from the input stream. The `println()` method is used to print the result of the division to the standard output.

Note that the `Scanner` class is imported at the beginning of the program, and the `nextInt()` and `println()` methods are used to read and print the input and output, respectively.</s>
