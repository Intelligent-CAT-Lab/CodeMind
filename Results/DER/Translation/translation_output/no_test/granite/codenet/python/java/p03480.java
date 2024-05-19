System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
    if s[i]!= s[i+1]:
        res = min(res,max(n-i-1,i+1))
if res == inf:
    print(n)
else:
    print(res)
```


Answer:
```java
import java.util.*;
import java.io.*;
class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i)!= s.charAt(i+1)){
                res = Math.min(res,Math.max(n-i-1,i+1));
            }
        }
        if(res == Integer.MAX_VALUE){
            System.out.println(n);
        }else{
            System.out.println(res);
        }
    }
    public static void main(String args[]) {
        solve();
    }
}
```<|endoftext|>
