<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
29

```
#!/usr/bin/python
# -*- coding: utf-8 -*-
import sys,collections,itertools,re,math,fractions,decimal,random,array,bisect,heapq

# decimal.getcontext().prec = 50
# sys.setrecursionlimit(10000)
MOD = 10**9 + 7

def solve(f):
    n = f.read_int()

    fact = [1] * (n+1)
    ifact = [1] * (n+1)
    for i in range(1, n+1):
        fact[i] = (fact[i-1] * i) % MOD
        ifact[i] = pow(fact[i], MOD-2, MOD)

    def nCk(n, k):
        if k < 0 or k > n: return 0
        return (fact[n] * ifact[n-k] * ifact[k]) % MOD

    ans = 0
    c0 = 0
    for i in xrange(n/2,n):
        c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + MOD) % MOD
        ans = (ans + c1*i) % MOD
        c0 = (c0 + c1) % MOD

    return ans


class Reader(object):
    def __init__(self, filename=None):
        self.file = open(filename) if filename is not None else None
        self.case = 1

    def __readline(self):
        return self.file.next().strip() if self.file else raw_input()

    def next_case(self):
        self.file.next()
        self.case += 1

    def read_int(self): return int(self.__readline())
    def read_float(self): return float(self.__readline())
    def read_long(self): return long(self.__readline())
    def read_decimal(self): return decimal.Decimal(self.__readline())
    def read_str(self): return self.__readline()

    def read_int_list(self): return map(int, self.__readline().split())
    def read_float_list(self): return map(float, self.__readline().split())
    def read_long_list(self): return map(long, self.__readline().split())
    def read_decimal_list(self): return map(decimal.Decimal, self.__readline().split())
    def read_str_list(self): return self.__readline().split()

if __name__ == '__main__':
    filename = sys.argv[1] if len(sys.argv) > 1 else None
    f = Reader(filename)
    if f.file:
        while True:
            print "Case #%d\n"%f.case, solve(f)
            try:
                f.next_case()
            except StopIteration:
                break
    else:
        print solve(f)

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] fact = new int[n+1];
        int[] ifact = new int[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % 1000000007;
            ifact[i] = pow(fact[i], 1000000007-2, 1000000007);
        }
        int ans = 0;
        int c0 = 0;
        for (int i = n/2; i <= n; i++) {
            int c1 = (nCk(i-1, n-1-i)*fact[i]*fact[n-i-1] - c0 + 1000000007) % 1000000007;
            ans = (ans + c1*i) % 1000000007;
            c0 = (c0 + c1) % 1000000007;
        }
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) ans = (ans * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }

    public static int nCk(int n, int k) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] * ifact[k]) % 1000000007;
    }
}
```

'''
<|endoftext|>
