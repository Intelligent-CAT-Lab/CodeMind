<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
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
        if (p == 0) {
            return Integer.parseInt(new Scanner(System.in).nextLine());
        }
        if (p == 1) {
            return new Scanner(System.in).nextInt();
        }
        if (p == 2) {
            return Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        if (p == 3) {
            return Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return 0;
    }

    public static void main(String[] args) {
        int t = 1;
        for (int term = 1; term <= t; term++) {
            int n = rd(1);
            int div = 10;
            int tot = 0;
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
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

Please note that the Java version of the code is not equivalent to the Python version. The Python version uses a combination of built-in functions and user-defined functions, while the Java version uses only built-in functions and classes. Also, the Python version uses a global variable, while the Java version uses a static variable.<｜end▁of▁sentence｜>
