import sys
readline = sys.stdin.readline
MOD = 10**9+7
N = int(readline())

dp1 = [0]*(N+3)
Dp1 = [0]*(N+3)
dp2 = [0]*(N+3)
Dp2 = [0]*(N+3)
dp1[0] = 1
Dp1[0] = 1
dp2[0] = N-1
Dp2[0] = N-1
dp1[1] = N-1
dp2[1] = (N-1)**2
dp1[2] = N-1
dp2[2] = (N-1)**2
Dp1[1] = Dp1[0] + dp1[1]
Dp2[1] = Dp2[0] + dp2[1]
Dp1[2] = Dp1[1] + dp1[2]
Dp2[2] = Dp2[1] + dp2[2]
for i in range(3, N+1):
    dp1[i] = (dp1[i-1] + Dp1[i-3] - 1) % MOD
    dp2[i] = (dp2[i-1] + Dp2[i-3]) % MOD
    Dp1[i] = (Dp1[i-1] + dp1[i]) % MOD
    Dp2[i] = (Dp2[i-1] + dp2[i]) % MOD
print(((Dp1[N-1] + Dp2[N-1]) % MOD))                 
