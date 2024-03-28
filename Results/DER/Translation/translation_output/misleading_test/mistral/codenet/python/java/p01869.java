<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
50

```
import bisect
import sys
sys.setrecursionlimit(10000)
a=[]
def f(a,bin,n):
    if bin>n:return
    if bin:a+=[bin]
    f(a,bin*10+2,n)
    f(a,bin*10+8,n)

def g(n,p):
    m=-1<<20
    x=bisect.bisect_left(a,n)
    if x!=len(a) and a[x]==n:m=1
    if a[p]**2>n:return m
    if n%a[p]==0:m=g(n//a[p],p)+1
    return max(m,g(n,p+1))

n=int(input())
if n&1:print(-1);exit()
f(a,0,n)
a=sorted(a)
b=g(n,0)
if b<0:b=-1
print(b)
```
[/INST]
```java
import java.util.*;

public class Main {
    static int[] a;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n & 1 == 0) {
            System.out.println(-1);
            return;
        }
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int b = g(n, 0);
        if (b < 0) {
            b = -1;
        }
        System.out.println(b);
    }

    public static int g(int n, int p) {
        int m = Integer.MIN_VALUE << 20;
        int x = bisect.bisect_left(a, n);
        if (x != a.length && a[x] == n) {
            m = 1;
        }
        if (a[p] * a[p] > n) {
            return m;
        }
        if (n % a[p] == 0) {
            return g(n / a[p], p) + 1;
        }
        return Math.max(m, g(n, p + 1));
    }

    public static void f(int[] a, int bin, int n) {
        if (bin > n) {
            return;
        }
        if (bin != 0) {
            a[bin] = bin;
        }
        f(a, bin * 10 + 2, n);
        f(a, bin * 10 + 8, n);
    }
}
```</s>
