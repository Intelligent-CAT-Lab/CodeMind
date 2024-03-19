<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 7

Expected output:
-89 66 7 -18 -25

```
import sys
import math
import heapq
sys.setrecursionlimit(10**7)
INTMAX = 9223372036854775807
INTMIN = -9223372036854775808
DVSR = 1000000007
def POW(x, y): return pow(x, y, DVSR)
def INV(x, m=DVSR): return pow(x, m - 2, m)
def DIV(x, y, m=DVSR): return (x * INV(y, m)) % m
def LI(): return [int(x) for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LS(): return input().split()
def II(): return int(input())
def FLIST(n):
    res = [1]
    for i in range(1, n+1): res.append(res[i-1]*i%DVSR)
    return res
def gcd(x, y):
    if x < y: x, y = y, x
    div = x % y
    while div!= 0:
        x, y = y, div
        div = x % y
    return y

K,X=LI()

for i in range(max(X-K+1, -1000000), min(X+K, 1000000)):
    print(i, end=" ")
print("")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[1000001];
        for(int i=0;i<1000001;i++) {
            arr[i] = i;
        }
        for(int i=0;i<1000001;i++) {
            arr[i] = arr[i] - K;
        }
        for(int i=0;i<1000001;i++) {
            arr[i] = arr[i] + K;
        }
        for(int i=0;i<1000001;i++) {
            if(arr[i] >= X && arr[i] <= X+K) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
```

'''
<|endoftext|>
