<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
    while div != 0:
        x, y = y, div
        div = x % y
    return y

K,X=LI()

for i in range(max(X-K+1, -1000000), min(X+K, 1000000)):
    print(i, end=" ")
print("")

```
[/INST]
```java
import java.util.*;

public class Main {
    final static int INTMAX = 9223372036854775807;
    final static int INTMIN = -9223372036854775808;
    final static long DVSR = 1000000007;

    static long POW(long x, long y) {
        return Math.pow(x, y, DVSR);
    }

    static long INV(long x, long m) {
        return POW(x, m - 2, m);
    }

    static long DIV(long x, long y, long m) {
        return (x * INV(y, m)) % m;
    }

    static List<Integer> LI() {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        while (sc.hasNextInt()) {
            res.add(sc.nextInt());
        }
        return res;
    }

    static List<Double> LF() {
        Scanner sc = new Scanner(System.in);
        List<Double> res = new ArrayList<>();
        while (sc.hasNextDouble()) {
            res.add(sc.nextDouble());
        }
        return res;
    }

    static String LS() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static int II() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static List<Long> FLIST(int n) {
        List<Long> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= n; i++) {
            res.add(res.get(i - 1) * i % DVSR);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = II();
        int X = II();

        for (int i = Math.max(X - K + 1, -1000000); i <= Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
```</s>
