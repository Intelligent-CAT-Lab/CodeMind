<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
010

Expected output:
2


```
#!/usr/bin/env python3
#ABC83 D

import sys
import math
from bisect import bisect_right as br
from bisect import bisect_left as bl
sys.setrecursionlimit(1000000000)
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

s = input()
n = len(s)
res = inf
for i in range(n-1):
    if s[i] != s[i+1]:
        res = min(res,max(n-i-1,i+1))
if res == inf:
    print(n)
else:
    print(res)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
    }
}
```
This is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `String` class to represent the input string. The `Math` class is used for mathematical operations such as `min` and `max`. The `Integer` class is used to represent the maximum value of an integer, which is used as a sentinel value to indicate that the minimum value has not been found yet.

The code first reads the input string from the user using the `Scanner` class, and then calculates the length of the string using the `length()` method. It then initializes the minimum value to the maximum value of an integer, which is used as a sentinel value to indicate that the minimum value has not been found yet.

The code then iterates over the characters of the string, and for each pair of adjacent characters, it checks if they are the same or not. If they are not the same, it calculates the minimum value of the two distances between the current character and the end of the string, and the current character and the beginning of the string. It then updates the minimum value if the current value is less than the previous minimum value.

Finally, the code prints the minimum value, or the length of the string if the minimum value has not been found yet.</s>
