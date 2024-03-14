<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 998244353

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    rr = []

    while True:
        p,q = LI()
        g = fractions.gcd(p,q)
        t = q//g
        k = 1
        if t % 2 == 0:
            k *= 2
            while t % 2 == 0:
                t //= 2
        for i in range(3,int(math.sqrt(t))+2,2):
            if t % i > 0:
                continue
            k *= i
            while t % i == 0:
                t //= i
        rr.append(t*k)

        break



    return '\n'.join(map(str, rr))


print(main())



```

### Response:
```java
import java.util.*;
import java.lang.*;

public class Main {
    private static final long inf = 1000000000000000000L;
    private static final double eps = 1.0 / 10000000000.0;
    private static final long mod = 998244353;

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> rr = new ArrayList<>();

        while (true) {
            long p = scanner.nextLong();
            long q = scanner.nextLong();
            long g = gcd(p, q);
            long t = q / g;
            long k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (long i = 3; i <= Math.sqrt(t) + 2; i += 2) {
                if (t % i > 0) {
                    continue;
                }
                k *= i;
                while (t % i == 0) {
                    t /= i;
                }
            }
            rr.add(t * k);

            break;
        }

        for (long r : rr) {
            System.out.println(r);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two long integers from the standard input, calculates the greatest common divisor of the two integers, and then calculates a value based on the gcd. The result is then printed to the standard output.
<|EOT|>
