<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    static int inf = (int) 1e20;
    static int mod = (int) 1e9 + 7;

    static List<Integer> LI() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    static int II() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static String S() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static List<String> LS() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
    }

    static List<Integer> factorization(int n) {
        List<Integer> buff = new ArrayList<>();
        int c, m;
        c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        buff.add(new int[]{2, c});
        c = 0;
        m = 3;
        while (m * m <= n) {
            c = 0;
            while (n % m == 0) {
                c++;
                n /= m;
            }
            buff.add(new int[]{m, c});
            if (m % 6 == 5) {
                m += 2;
            } else {
                m += 4;
            }
        }
        if (n > 1) {
            buff.add(new int[]{n, 1});
        }
        return buff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> f = factorization(i);
            for (int k : f) {
                d.put(k, d.getOrDefault(k, 0) + f.get(1));
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= mod;
        }
        System.out.println(r);
    }
}
```</s>
