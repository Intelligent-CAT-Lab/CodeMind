def p02775():
    N = input()
    l = len(N) + 1

    # 0 ãã¤ã, 1 ã´ã£ãã, 2 å¤ã
    dp = [[0 for _ in range(3)] for _ in range(l)]

    dp[0][0] = dp[0][2] = 1

    for i in range(1, l - 1):
        c = int(N[i])
        dp[i][0] = min(dp[i - 1][0], dp[i - 1][2]) + 9 - c
        dp[i][1] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c
        dp[i][2] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1

    dp[l - 2][0] += 1
    print(min(dp[l - 2][0], min(dp[l - 2][1], dp[l - 2][2])))

p02775()