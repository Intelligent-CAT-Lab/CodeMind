<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
4


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

public class Main {
    static int mod = 1000000007;

    static List<int[]> factorization(int n) {
        List<int[]> buff = new ArrayList<>();
        int c = 0;
        while (n % 2 == 0) {
            c += 1;
            n /= 2;
        }
        if (c > 0) buff.add(new int[]{2, c});
        c = 0;
        while (n % 3 == 0) {
            c += 1;
            n /= 3;
        }
        if (c > 0) buff.add(new int[]{3, c});
        int x = 5;
        while (n >= x * x) {
            c = 0;
            while (n % x == 0) {
                c += 1;
                n /= x;
            }
            if (c > 0) buff.add(new int[]{x, c});
            if (x % 6 == 5)
                x += 2;
            else
                x += 4;
        }
        if (n > 1) buff.add(new int[]{n, 1});
        return buff;
    }

    static int main() {
        int n = new Scanner(System.in).nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] pair : factorization(i)) {
                d.put(pair[0], d.getOrDefault(pair[0], 0) + pair[1]);
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= mod;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}
```

Please note that Java does not have a built-in function to split input into integers, so we use `Scanner` to read the input. Also, Java does not have a built-in dictionary like Python, so we use `HashMap` instead.<｜end▁of▁sentence｜>
