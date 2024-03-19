<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-94

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

@@ Response
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int g = gcd(p, q);
            int t = q / g;
            int k = 1;
            if (t % 2 == 0) {
                k *= 2;
                while (t % 2 == 0) {
                    t /= 2;
                }
            }
            for (int i = 3; i <= Math.sqrt(t) + 2; i += 2) {
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

        for (int i : rr) {
            System.out.println(i);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the greatest common divisor (gcd) of the two integers, divides the second integer by the gcd, and then finds the smallest prime factor of the resulting number. The smallest prime factor is then multiplied by the current value of k, and the loop continues until the resulting number is no longer divisible by the current number. The final result is added to a list, and the list is printed to the standard output.<｜end▁of▁sentence｜>
