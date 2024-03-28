<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
39

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[1000001];
        for(int i=1;i<=n;i++){
            for(int k:factorization(i)){
                d[k]++;
            }
        }
        int r = 1;
        for(int c:d){
            r *= c+1;
            r %= 1000000007;
        }
        System.out.println(r);
    }
    public static int[] factorization(int n){
        int[] buff = new int[1000001];
        int c = 0;
        while(n%2==0){
            c++;
            n/=2;
        }
        if(c>0) buff[2] = c;
        c = 0;
        while(n%3==0){
            c++;
            n/=3;
        }
        if(c>0) buff[3] = c;
        int x = 5;
        while(n>=x*x){
            c = 0;
            while(n%x==0){
                c++;
                n/=x;
            }
            if(c>0) buff[x] = c;
            if(x%6==5) x+=2;
            else x+=4;
        }
        if(n>1) buff[n] = 1;
        return buff;
    }
}
```
<|endoftext|>
