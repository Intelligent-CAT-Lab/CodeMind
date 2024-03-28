import sys

def fact(n):
    fact = [1, 1]
    for i in range(2, n+1):
        fact.append((i % 1000000007 * fact[i-1]) % 1000000007)
    return fact[n]

def nCk(n, k):
    if n < k:
        return 0
    else:
        return fact[n] % 1000000007 * inv(fact[n-k], 1000000007) % 1000000007 * inv(fact[k], 1000000007) % 1000000007

def inv(a, mod):
    a = a % mod
    b = mod
    p = 1
    q = 0

    while b > 1:
        c = b // a
        b = b % a
        q = q - p * c
        d = b
        b = a
        a = d
        d = p
        p = q
        q = d

    while q < 0:
        q += mod

    return q % mod

def solver():
    n, m, k = map(int, input().split())
    fact = [1, 1]
    for i in range(2, n+m+2*k+1):
        fact.append((i % 1000000007 * fact[i-1]) % 1000000007)
    ans = 0
    for i in range(0, k+1):
        a = 1
        b = 1
        j = k - i
        if i >= 1:
            a = (nCk(n+2*i, i) + 1000000007 - nCk(n+2*i, i-1)) % 1000000007
        if j >= 1:
            b = (nCk(m+2*j, j) + 1000000007 - nCk(m+2*j, j-1)) % 1000000007
        ans += nCk(n+m+2*k, n+2*i) % 1000000007 * a % 1000000007 * b % 1000000007
        ans %= 1000000007

    while ans < 0:
        ans += 1000000007

    print(ans)

if __name__ == "__main__":
    tr(sys.argv)
    solver()