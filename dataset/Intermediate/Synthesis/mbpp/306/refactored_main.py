a = [1, 101, 2, 3, 100, 4, 5 ]
n = 7
index = 4
k = 6
dp = [[0 for i in range(n)] 
        for i in range(n)]
for i in range(n):
    if a[i] > a[0]:
        dp[0][i] = a[i] + a[0]
    else:
        dp[0][i] = a[i]
for i in range(1, n):
    for j in range(n):
        if a[j] > a[i] and j > i:
            if dp[i - 1][i] + a[j] > dp[i - 1][j]:
                dp[i][j] = dp[i - 1][i] + a[j]
            else:
                dp[i][j] = dp[i - 1][j]
        else:
            dp[i][j] = dp[i - 1][j]
print(dp[index][k])