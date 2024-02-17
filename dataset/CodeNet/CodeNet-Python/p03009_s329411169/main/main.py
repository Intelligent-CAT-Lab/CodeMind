N, H, D = list(map(int, input().split()))
MOD = 10 ** 9 + 7

fact = 1
s = 0
for i in range(1, N+1) :
    fact = fact * i % MOD
    s = (s + fact) % MOD

dp = [0] * H
dp[0] = 1
ret = 1

for i in range(1, H) :
    dp[i] = ret * s % MOD
    ret = (ret + ret * s) % MOD
    if i >= D : 
        ret = (ret - dp[i - D]) % MOD
        
print((ret * fact % MOD))