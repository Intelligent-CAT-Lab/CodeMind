<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def factorization(n):
    def factor_sub(n, m):
        c = 0
        while n % m == 0:
            c += 1
            n /= m
        return c, n
    #
    buff = []
    c, m = factor_sub(n, 2)
    if c > 0: buff.append((2, c))
    c, m = factor_sub(m, 3)
    if c > 0: buff.append((3, c))
    x = 5
    while m >= x * x:
        c, m = factor_sub(m, x)
        if c > 0: buff.append((x, c))
        if x % 6 == 5:
            x += 2
        else:
            x += 4
    if m > 1: buff.append((m, 1))
    return buff

def main():
    n = II()
    d = collections.defaultdict(int)
    for i in range(1,n+1):
        for k,v in factorization(i):
            d[k] += v
    r = 1
    for c in d.values():
        r *= c+1
        r %= mod
    return r


print(main())

```

@@ Response
```java
import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1000000007;
    static final int INF = (int)1e20;

    static int[] factorization(int n) {
        int[] buff = new int[n+1];
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                buff[i]++;
                n /= i;
            }
        }
        return buff;
    }

    static int main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int[] f = factorization(i);
            for (int j = 0; j < f.length; j++) {
                d[j] += f[j];
            }
        }
        long r = 1;
        for (int c : d) {
            r *= c+1;
            r %= MOD;
        }
        return (int)r;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}
```

Please note that Java does not have a built-in function to split a string into an array of integers like Python's ```split()```. Therefore, we use the ```Scanner``` class to read the input. Also, Java does not have a built-in ```defaultdict``` like Python, so we use an array to simulate it.<｜end▁of▁sentence｜>
