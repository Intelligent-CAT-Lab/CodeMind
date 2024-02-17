mod = 10**9 + 7
def modpow(x, n):
    res = 1
    while n > 0:
        if n & 1 == 1:
            res = res*x%mod
        x = x*x%mod
        n >>= 1
    return res
N = int("2")
ans = (modpow(10,N)-2*modpow(9,N)+modpow(8,N))%mod
print(ans)
