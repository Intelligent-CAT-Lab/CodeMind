
```
import math

n,m,k=map(int,input().split())

mod=998244353

fact=[0]*(n+1)
ifact=[0]*(n+1)
fact[0]=fact[1]=ifact[0]=ifact[1]=1
for i in range(1,n+1):
    fact[i]=fact[i-1]*i%mod
    ifact[i]=pow(fact[i],mod-2,mod)

def NcR(n,r):
    return fact[n]*ifact[r]*ifact[n-r]%mod

def modPow(a,p,m):
    if a==1:
        return 1
    ans=1
    while p>0:
        if p%2==1:
            ans=ans*a%m
        a=a*a%m
        p>>=1
    return ans

def modInv(a,m):
    return modPow(a,m-2,m)

ans=0
for i in range(k+1):
    ans=(ans+m*modPow(m-1,n-i-1,mod)*NcR(n-1,i)%mod)%mod

print(ans)
```

## 2686. [Codeforces Round #611 (Div. 2)]

### 题目描述

给定一个长度为$n$的序列$a$，求满足$a_i\oplus a_j\oplus a_k=0$的三元组$(i,j,k)$的数量。

### 题解

首先，我们可以发现，$a_i\oplus a_j\oplus a_k=0$等价于$a_i\oplus a_j=a_k$。

然后，我们可以枚举$a_i$，然后统计$a_i\oplus a_j$的数量，然后再统计$a_i\oplus a_j=a_k$的数量。

### 代码

```
import java.io.*;
import java
