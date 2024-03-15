<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.io.*;
import java.util.*;

public class Main {
    static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n;
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            n = Integer.parseInt(st.nextToken());
            sb.setLength(0);
            int fact[] = new int[n + 1];
            int ifact[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                fact[i] = (fact[i - 1] * i) % MOD;
                ifact[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
            }
            int ans = 0;
            int c0 = 0;
            for (int i = n / 2; i >= 1; i--) {
                int c1 = (nCk(i - 1, n - 1 - i) * fact[i] * fact[n - i - 1] - c0 + MOD) % MOD;
                ans = (ans + c1 * i) % MOD;
                c0 = (c0 + c1) % MOD;
            }
            System.out.printf("Case #%d\n%s\n", n, ans);
        }
    }

    static int nCk(int n, int k) {
        if (k < 0 || k > n)
            return 0;
        return (fact[n] * ifact[n - k] * ifact[k]) % MOD;
    }

    static int fact[] = new int[100000];
    static int ifact[] = new int[100000];

    static {
        for (int i = 0; i < 100000; i++) {
            fact[i] = 1;
            ifact[i] = 1;
        }
        for (int i = 1; i < 100000; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            ifact[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
        }
    }
}
```</s>
