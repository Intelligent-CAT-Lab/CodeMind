from functools import reduce

mod = 924844033
frac = [1]*5555
for i in range(2,5555):
    frac[i] = i * frac[i-1]%mod
fraci = [None]*5555
fraci[-1] = pow(frac[-1], mod -2, mod)
for i in range(-2, -5555, -1):
    fraci[i] = fraci[i+1] * (5555 + i + 1) % mod

N, K = map(int, input().split())

dp = [[[0]*3 for _ in range(N)] for _ in range(-(-N//(2*K)) + 1)]

def merge(A, B):
    C = [0]*(len(A) + len(B) - 1)
    for i in range(len(A)):
        for j in range(len(B)):
            C[i+j] = (C[i+j] + A[i]*B[j]) % mod
    return C

for j in range(min(N, 2*K)):
    dp[0][j][2] = 1
    if j + K <= N-1:
        dp[1][j][0] = 1
    if j - K >= 0:
        dp[1][j][1] = 1

for i in range(-(-N//(2*K)) + 1):
    for j in range(N):
        if j + 2*K > N - 1:
            break
        r = dp[i][j][0]
        l = dp[i][j][1]
        n = dp[i][j][2]
        if i == -(-N//(2*K)):
            dp[i][j+2*K][2] = (dp[i][j+2*K][2] + r + l + n) % mod
            continue
        if j + 3*K <= N - 1:
            dp[i+1][j+2*K][0] = (dp[i+1][j+2*K][0] + r + l + n) % mod
        dp[i][j+2*K][2] = (dp[i][j+2*K][2] + r + l + n) % mod
        dp[i+1][j+2*K][1] = (dp[i+1][j+2*K][1] + l + n) % mod
Ans = []
for j in range(min(2*K, N)):
    j = - 1 - j
    Ans.append([sum(dp[i][j]) for i in range(-(-N//(2*K)) + 1)])

A = reduce(merge, Ans)
A = [((-1)**i * frac[N - i] * a)%mod for i, a in enumerate(A)]
print(sum(A)%mod)
