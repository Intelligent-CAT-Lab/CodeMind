System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
96

```
from itertools import *
from bisect import *
from math import *
from collections import *
from heapq import *
from random import *
import sys

sys.setrecursionlimit(10 ** 6)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")
def II(): return int(sys.stdin.readline())
def MI(): return map(int, sys.stdin.readline().split())
def MI1(): return map(int1, sys.stdin.readline().split())
def MF(): return map(float, sys.stdin.readline().split())
def LI(): return list(map(int, sys.stdin.readline().split()))
def LI1(): return list(map(int1, sys.stdin.readline().split()))
def LF(): return list(map(float, sys.stdin.readline().split()))
def LLI(rows_number): return [LI() for _ in range(rows_number)]
dij = [(1, 0), (0, 1), (-1, 0), (0, -1)]

def main():
    def ok(m):
        s=0
        cnt=0
        while m:
            s+=m
            cnt+=1
            if s>k:return False
            if cnt==n:break
            m>>=1
        return True

    n,k=MI()
    l=0
    r=k+1
    while l+1<r:
        m=(l+r)//2
        if ok(m):l=m
        else:r=m
    print(l)

main()


```


Answer:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            int sum = 0;
            int count = 0;
            int temp = m;
            while (temp > 0) {
                sum += temp;
                count++;
                if (sum > k) {
                    break;
                }
                temp /= 2;
            }
            if (count == n) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }
}
```<|endoftext|>
