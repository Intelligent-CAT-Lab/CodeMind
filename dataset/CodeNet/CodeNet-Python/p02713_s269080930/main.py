import math
# K = int(input())
# ans = 0
# for i in range(1,K+1):
#     for j in range(1,K+1):
#         for k in range(1,K+1):
#             ans+=math.gcd(i,math.gcd(j,k)) 
# print(ans)           


ans = 0
K = int(input())
dp = [[1] * 220 for i in range(220)] 
for i in range(1,K+1):
    for j in range(1,K+1):
        dp[i][j] = math.gcd(i,j)
for i in range(1,K+1):
    for j in range(1,K+1):
        for k in range(1,K+1):
            a = dp[i][j]
            ans += dp[a][k]
print(ans)
