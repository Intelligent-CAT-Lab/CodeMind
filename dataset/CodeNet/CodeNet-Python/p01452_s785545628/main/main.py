import sys
readline = sys.stdin.readline
write = sys.stdout.write
def solve():
    MOD = 10**9 + 7
    N, M, K = list(map(int, readline().split()))
    MOD = 10**9 + 7

    L = N+M+2*K

    fact = [1]*(L+1)
    rfact = [1]*(L+1)
    r = 1
    for i in range(1, L+1):
        fact[i] = r = r * i % MOD
    rfact[L] = r = pow(fact[L], MOD-2, MOD)
    for i in range(L, 0, -1):
        rfact[i-1] = r = r * i % MOD

    def C(n, k):
        return fact[n] * rfact[n-k] * rfact[k] % MOD
    def F(n, k):
        return (fact[n+k] * (n-k+1) % MOD) * (rfact[k] * rfact[n+1] % MOD) % MOD
    ans = 0
    for a in range(K+1):
        b = K-a
        ans += C(N+2*a+M+2*b, N+2*a) * F(N+a, a) * F(M+b, b) % MOD
    ans %= MOD
    write("%d\n" % ans)
solve()

