<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3

Expected output:
92.98921496973458

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
This is a simple program that reads two integers `t` and `x` from the standard input, divides `t` by `x`, and prints the result to the standard output.

The `Scanner` class is used to read the input from the standard input, and the `nextInt()` method is used to read the next integer from the input. The `println()` method is used to print the result to the standard output.

Note that this program assumes that the input is valid and that the division operation will not result in an overflow. If you need to handle invalid input or overflow, you may need to add additional error checking and handling code.</s>
