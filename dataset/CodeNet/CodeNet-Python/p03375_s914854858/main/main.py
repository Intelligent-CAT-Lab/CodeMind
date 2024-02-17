N, M = list(map(int, input().split()))
fact = [1]*(N+1)
rfact = [1]*(N+1)
for i in range(1, N+1):
    fact[i] = r = (i * fact[i-1]) % M
    rfact[i] = pow(r, M-2, M)


memo = {}
def f(N, K):
    if (N, K) in memo:
        return memo[N, K]
    if K == 0:
        return N == 0
    elif K == 1 or N == K:
        return 1
    r = memo[N, K] = (f(N-1, K-1) + K*f(N-1, K)) % M
    return r

S = [1]

rev2 = pow(2, M-2, M)
base = pow(2, N, M)
ans = 0
S = [1]
for K in range(N+1):
    r = (fact[N] * rfact[K] * rfact[N-K]) % M
    r = (r * pow(2, pow(2, N - K, M-1), M)) % M
    b = 1
    v = 0
    T = [0]*(K+2)
    for L in range(K):
        T[L+1] = s = (S[L] + (L+1)*S[L+1]) % M
        v += s * b
        b = (b * base) % M
    v += b
    T[K+1] = 1
    S = T
    r = (r * v) % M
    if K % 2:
        ans -= r
    else:
        ans += r
    ans %= M

    base = (base * rev2) % M
print(ans)
