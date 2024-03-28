<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
ACLACLACL


```
def main():
    import sys
    input = sys.stdin.readline
    sys.setrecursionlimit(10**7)
    from collections import Counter, deque
    from collections import defaultdict
    from itertools import combinations, permutations, accumulate, groupby, product
    from bisect import bisect_left,bisect_right
    from heapq import heapify, heappop, heappush
    from math import floor, ceil,pi,factorial
    from operator import itemgetter
    def I(): return int(input())
    def MI(): return map(int, input().split())
    def LI(): return list(map(int, input().split()))
    def LI2(): return [int(input()) for i in range(n)]
    def MXI(): return [[LI()]for i in range(n)]
    def SI(): return input().rstrip()
    def printns(x): print('\n'.join(x))
    def printni(x): print('\n'.join(list(map(str,x))))
    inf = 10**17
    mod = 10**9 + 7
#main code here!
    k=I()
    s=""
    for i in range(k):
        s+="ACL"
    print(s)
    








if __name__=="__main__":
    main()


```

### Response:
```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < k; i++){
            s.append("ACL");
        }
        System.out.println(s.toString());
    }
}
```
<|EOT|>
