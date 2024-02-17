mod = 10**9+7
n = int(input())
def nth_bit(d):
    return (n>>d)&1

dp = [[0,0,0] for _ in range(61)]
dp[-1][0] = 1
for d in range(59,-1,-1):
    for s in range(3):
        for k in range(3):
            s2 = min(2,2*s+nth_bit(d)-k)
            if s2>=0:
                dp[d][s2] += dp[d+1][s]
ans = sum(dp[0])%mod
print(ans)