def p01979():
    numArr = input()
    arr = [int(char) - '0' for char in numArr]
    n = len(arr)
    dp = [[[0 for _ in range(10)] for _ in range(10)] for _ in range(10)] for _ in range(n+1)]
    counts = [[0, 0] for _ in range(n+1)]
    dp[1][0][0][0][0][1] = 1
    for i in range(1, n+1):
        for a in range(10):
            for b in range(10):
                for c in range(10):
                    for d in range(10):
                        for e in range(10):
                            dp[i][b][c][d][e][0] += dp[i-1][a][b][c][d][0]
                            if e < arr[i-1]:
                                dp[i][b][c][d][e][0] += dp[i-1][a][b][c][d][1]
                            elif e == arr[i-1]:
                                dp[i][b][c][d][e][1] += dp[i-1][a][b][c][d][1]
    for i in range(1, n+1):
        for e in range(10):
            counts[i][0] += counts[i-1][0]
            if e < arr[i-1]:
                counts[i][0] += counts[i-1][1]
            elif e == arr[i-1]:
                counts[i][1] += counts[i-1][1]
    for j in range(10):
        counts[n][0] += dp[n][5][1][j][3][0]
        counts[n][1] += dp[n][5][1][j][3][1]
        dp[n][5][1][j][3][0] = 0
        dp[n][5][1][j][3][1] = 0
    return counts[n][0] + counts[n][1]

p01979()