
```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rr = new ArrayList<>();

        while (true) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int g = BigInteger.valueOf(p).gcd(BigInteger.valueOf(q)).intValue();
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

        for (int i = 0; i < rr.size(); i++) {
            System.out.println(rr.get(i));
        }
    }
}

```

## D - 
[https://atcoder.jp/contests/abc172/tasks/abc172_d](https://atcoder.jp/contests/abc172/tasks/abc172_d)


## E - 
[https://atcoder.jp/contests/abc172/tasks/abc172_e](https://atcoder.jp/contests/abc172/tasks/abc172_e)


## F - 
[https://atcoder.jp/contests/abc172/tasks/abc172_f](https://atcoder.jp/contests/abc172/tasks/abc172_f)
/archive/abc171/c.py
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
        n = I()
        s = ''
        while n > 0:
            n -= 1
            s = chr(n % 26 + ord('a')) + s
            n //= 26
        rr.append(s)

        break



    return '\n'.join(map(str, rr))


print(main())


/archive/abc171/d.py
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
        n = I()
        a = LI()
        q = I()
        d = collections.defaultdict(int)
        for i in range(n):
            d[a[i]] += 1
        s = sum(a)
        for i in range(q):
            b,c = LI()
            s += (c-b) * d[b]
            d[c] += d[b]
            d[b] = 0
            rr.append(s)

        break



    return '\n'.join(map(str, rr))


print(main())



# import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools
#
# sys.setrecursionlimit(10**7)
# inf = 10**20
# eps = 1.0 / 10**10
# mod = 998244353
#
# def LI(): return [int(x) for x in sys.stdin.readline().split()]
# def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
# def LF(): return [float(x) for x in sys.stdin.readline().split()]
# def LS(): return sys.stdin.readline().split()
# def I(): return int(sys.stdin.readline())
# def F(): return float(sys.stdin.readline())
# def S(): return input()
# def pf(s): return print(s, flush=True)
#
#
# def main():
#     rr = []
#
#     while True:
#         n = I()
#         a = LI()
#         q = I()
#         d = collections.defaultdict(int)
#         for i in range(n):
#             d[a[i]] += 1
#         s = sum(a)
#         for i in range(q):
#             b,c = LI()
#             s += (c-b) * d[b]
#             d[c] += d[b]
#             d[b] = 0
#             rr.append(s)
#
#         break
#
#
#
#     return '\n'.join(map(str, rr))
#
#
# print(main())
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#

