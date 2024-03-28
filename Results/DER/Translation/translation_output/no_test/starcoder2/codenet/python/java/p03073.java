
```java

```
/atcoder/abc/abc170/abc170_d.py
import sys
sys.setrecursionlimit(10**7)
INF = 10 ** 18
MOD = 10 ** 9 + 7
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def II(): return int(sys.stdin.readline())
def SI(): return input()
def YN(b): print('Yes') if b else print('No')
def yn(b): print('YES') if b else print('NO')
def Yn(b): print('Yes') if b else print('no')
def yN(b): print('YES') if b else print('nO')
def nY(b): print('No') if b else print('YES')
def Ny(b): print('NO') if b else print('Yes')
def NY(b): print('nO') if b else print('YEs')

N = II()
A = LI()

A.sort()

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def is_prime_list(n):
    if n == 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(n**0.5)+1, 2):
        if n % i == 0:
            return False
    return True

def prime_list(n):
    if n == 1:
        return []
    prime = [2]
    limit = int(n**0.5)
    data = [i + 1 for i in range(2, n, 2)]
    while limit > data[0]:
        prime.append(data[0])
        data = [j for j in data if j % data[0] != 0]
    return prime + data

def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

def prime_factorize_dict(n):
    a = {}
    while n % 2 == 0:
        if 2 not in a:
            a[2] = 0
        a[2] += 1
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            if f not in a:
                a[f] = 0
            a[f] += 1
            n //= f
        else:
            f += 2
    if n != 1:
        if n not in a:
            a[n] = 0
        a[n] += 1
    return a

def divisor(n):
    a = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            a.append(i)
            if i != n // i:
                a.append(n//i)
    return a

def divisor_dict(n):
    a = {}
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            if i not in a:
                a[i] = 0
            a[i] += 1
            if i != n // i:
                if n//i not in a:
                    a[n//i] = 0
                a[n//i] += 1
    return a

def divisor_list(n):
    a = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            a.append(i)
            if i != n // i:
                a.append(n//i)
    return a

def divisor_list_dict(n):
    a = {}
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            if i not in a:
                a[i] = 0
            a[i] += 1
            if i != n // i:
                if n//i not in a:
                    a[n//i] = 0
                a[n//i] += 1
    return a

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

def comb(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    r = min(r, n - r)
    return fact[n] * factinv[r] * factinv[n-r] % MOD

def comb_list(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    r = min(r, n - r)
    return fact[n] * factinv[r] * factinv[n-r] % MOD

def comb_dict(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    r = min(r, n - r)
    return fact[n] * factinv[r] * factinv[n-r] % MOD

def perm(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    return fact[n] * factinv[n-r] % MOD

def perm_list(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    return fact[n] * factinv[n-r] % MOD

def perm_dict(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    return fact[n] * factinv[n-r] % MOD

def 1
    return fact[n] * factinv[n-r] % MOD

def perm_dict(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    return fact[n] * factinv[n-r] % MOD

def nCr(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    r = min(r, n - r)
    return fact[n] * factinv[r] * factinv[n-r] % MOD

def nPr(n, r):
    if n == 0 and r == 0: return 1
    if n < r: return 0
    return fact[n] * factinv[n-r] % MOD

def nHr(n, r):
    return comb(n
