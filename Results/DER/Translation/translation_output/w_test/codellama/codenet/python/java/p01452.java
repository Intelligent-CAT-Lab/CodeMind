<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 0

Expected output:
210


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)

def inv(x):
    return pow(x, mod - 2, mod)

cms = 10**6
cm = [0] * cms

def comb_init():
    cm[0] = 1
    for i in range(1, cms):
        cm[i] = cm[i-1] * i % mod

def comb(a, b):
    return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod


def main():
    rr = []

    def f(n,m,k):
        comb_init()
        r = 0
        for i in range(k+1):
            j = k - i
            mt = comb(n+m+k*2, n+i*2)
            lk = rk = 1
            if i > 0:
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod
            if j > 0:
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod
            r += mt * lk * rk % mod
            r %= mod

        return r

    while 1:
        n,m,k = LI()
        if n == 0:
            break
        rr.append(f(n,m,k))
        break

    return '\n'.join(map(str, rr))


print(main())


```
[/INST]

Here is the Java code for the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] cm = new int[1000001];
        cm[0] = 1;
        for (int i = 1; i < 1000001; i++) {
            cm[i] = cm[i - 1] * i % 1000000007;
        }
        int r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            int mt = comb(n + m + k * 2, n + i * 2);
            int lk = 1;
            int rk = 1;
            if (i > 0) {
                lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1)) % 1000000007;
            }
            if (j > 0) {
                rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1)) % 1000000007;
            }
            r += mt * lk * rk % 1000000007;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    public static int comb(int a, int b) {
        return (cm[a] * inv(cm[a - b]) % 1000000007) * inv(cm[b]) % 1000000007;
    }

    public static int inv(int x) {
        return (int) Math.pow(x, 1000000007 - 2, 1000000007);
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses a different approach to calculate the combinations. The `comb` function in Java is a modified version of the `comb` function in Python, which uses the `cm` array to store the values of the combinations. The `inv` function in Java is a modified version of the `inv` function in Python, which uses the `Math.pow` method to calculate the inverse of a number modulo a prime.</s>
