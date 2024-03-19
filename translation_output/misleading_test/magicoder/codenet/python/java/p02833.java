<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
-87

```
###### Importing Libraries ######
import math
import operator as op
from functools import reduce
from fractions import Fraction as frac
#################################
##### User defined function #####

############ NCR ###############
def ncr(n, r):
    r = min(r, n-r)
    numer = reduce(op.mul, range(n, n-r, -1), 1)
    denom = reduce(op.mul, range(1, r+1), 1)
    return numer / denom
    
############ READ ###############
def rd(p):
    if(p==0):
        return input()
    if(p==1):
        return int(input())
    if(p==2):
        return map(int,input().split())
    if(p==3):
        return list(map(int,input().split()))


############ DSU ###############
global par
par=[-1 for i in range(100001)]
# t=rd(1)
def find(u):
    if(par[u]<0):
        return u
    else:
        return find(par[u])
def uni(x,y):
    u=find(x)
    v=find(y)
    if u==v:
        return
    if(par[u]<par[v]):
        par[u]+=par[v]
        par[v]=u
    else:    
        par[v]+=par[u]
        par[u]=v
################################        
        

t=1
for term in range(1,t+1):
    n=rd(1)
    div=10
    tot=0
    if n%2==1:
        print(0)
    else:    
        while(n>=div):
            # print(n//div)
            tot+=(n//div)
            div*=5
        print(tot)
    
        
    
    
```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static int[] par = new int[100001];

    static int find(int u) {
        if (par[u] < 0)
            return u;
        else
            return find(par[u]);
    }

    static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if (u == v)
            return;
        if (par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }

    static int ncr(int n, int r) {
        r = Math.min(r, n - r);
        int numer = 1;
        int denom = 1;
        for (int i = 0; i < r; i++) {
            numer *= (n - i);
            denom *= (i + 1);
        }
        return numer / denom;
    }

    static int rd(int p) {
        Scanner sc = new Scanner(System.in);
        if (p == 0)
            return sc.next();
        if (p == 1)
            return sc.nextInt();
        if (p == 2)
            return sc.nextInt();
        if (p == 3)
            return sc.nextInt();
        return 0;
    }

    public static void main(String[] args) {
        int t = 1;
        for (int term = 1; term <= t; term++) {
            int n = rd(1);
            int div = 10;
            int tot = 0;
            if (n % 2 == 1)
                System.out.println(0);
            else {
                while (n >= div) {
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
    }
}
```

Please note that Java does not have a built-in function for factorial, so the `ncr` function is implemented manually. Also, Java does not have a built-in function for map, so the `rd` function is implemented manually.<｜end▁of▁sentence｜>
