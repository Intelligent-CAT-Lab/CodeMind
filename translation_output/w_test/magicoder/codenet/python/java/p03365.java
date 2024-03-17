<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
16


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

@@ Response
```java
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf((long)1e9 + 7);
    static BigInteger[] fact, ifact;

    static BigInteger nCk(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        return fact[n].multiply(ifact[n-k]).multiply(ifact[k]).mod(MOD);
    }

    static BigInteger solve(Scanner sc) {
        int n = sc.nextInt();
        fact = new BigInteger[n+1];
        ifact = new BigInteger[n+1];
        fact[0] = BigInteger.ONE;
        ifact[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(MOD);
            ifact[i] = fact[i].modInverse(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n/2; i < n; i++) {
            BigInteger c1 = nCk(i-1, n-1-i).multiply(fact[i]).multiply(fact[n-i-1]).subtract(c0).add(MOD).mod(MOD);
            ans = ans.add(c1.multiply(BigInteger.valueOf(i))).mod(MOD);
            c0 = c0.add(c1).mod(MOD);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the factorial and inverse factorial of the integer, and then calculates the answer. The answer is printed to the standard output.<｜end▁of▁sentence｜>
