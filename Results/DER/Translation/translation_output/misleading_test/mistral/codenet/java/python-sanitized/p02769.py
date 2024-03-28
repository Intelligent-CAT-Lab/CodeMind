import sys

def fact(n):
    fact = [1]
    for i in range(2, n+1):
        fact.append(i * fact[i-1])
    return fact

def fact_inv(n):
    fact_inv = [1]
    for i in range(2, n+1):
        fact_inv.append(pow(fact[i], n-2, mod))
    return fact_inv

mod = 1000000007
n = int(input())
k = int(input())

fact = fact(n)
fact_inv = fact_inv(n)

ans = 0
for i in range(k+1):
    up = fact[n+1] * fact[n]
    up %= mod
    den1 = fact_inv[i] * fact_inv[i]
    den1 %= mod
    den2 = fact_inv[n-i] * fact_inv[n-i-1]
    den2 %= mod
    den = den1 * den2
    den %= mod
    ans += up * den
    ans %= mod

print(ans)