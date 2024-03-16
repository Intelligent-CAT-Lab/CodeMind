if __name__ == "__main__":
    num_str = input()
    numArr = list(map(int, num_str))
    length = len(numArr)
    dp = [[[[[[0 for _ in range(2)] for _ in range(10)] for _ in range(10)]
             for _ in range(10)] for _ in range(10)] for _ in range(length + 1)]
    dp[0][0][0][0][0][1] = 1
    counts = [[0 for _ in range(2)] for _ in range(length + 1)]

    for i in range(1, length + 1):
        for a in range(10):
            for b in range(10):
                for c in range(10):
                    for d in range(10):
                        for e in range(10):
                            dp[i][b][c][d][e][0] += dp[i-1][a][b][c][d][0]
                            if e < numArr[i-1]:
                                dp[i][b][c][d][e][0] += dp[i-1][a][b][c][d][1]
                            elif e == numArr[i-1]:
                                dp[i][b][c][d][e][1] += dp[i-1][a][b][c][d][1]

        for e in range(10):
            counts[i][0] += counts[i-1][0]
            if e < numArr[i-1]:
                counts[i][0] += counts[i-1][1]
            elif e == numArr[i-1]:
                counts[i][1] += counts[i-1][1]

        for j in range(10):
            counts[i][0] += dp[i][5][1][j][3][0]
            counts[i][1] += dp[i][5][1][j][3][1]
            dp[i][5][1][j][3][0] = 0
            dp[i][5][1][j][3][1] = 0

    print(counts[length][0] + counts[length][1])