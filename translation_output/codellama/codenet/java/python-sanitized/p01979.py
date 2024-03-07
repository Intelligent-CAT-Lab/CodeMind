import sys

def main():
    num_arr = sys.stdin.readline().strip()
    length = len(num_arr)
    arr = [int(num) for num in num_arr]
    dp = [[[0] * 10 for _ in range(10)] for _ in range(length + 1)]
    counts = [[0] * 2 for _ in range(length + 1)]
    dp[0][0][0][0][0][1] = 1
    for i in range(1, length + 1):
        for a in range(10):
            for b in range(10):
                for c in range(10):
                    for d in range(10):
                        for e in range(10):
                            dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][0]
                            if e < arr[i - 1]:
                                dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][1]
                            elif e == arr[i - 1]:
                                dp[i][b][c][d][e][1] += dp[i - 1][a][b][c][d][1]
        for e in range(10):
            counts[i][0] += counts[i - 1][0]
            if e < arr[i - 1]:
                counts[i][0] += counts[i - 1][1]
            elif e == arr[i - 1]:
                counts[i][1] += counts[i - 1][1]
        for j in range(10):
            counts[i][0] += dp[i][5][1][j][3][0]
            counts[i][1] += dp[i][5][1][j][3][1]
            dp[i][5][1][j][3][0] = 0
            dp[i][5][1][j][3][1] = 0
    print(counts[length][0] + counts[length][1])

if __name__ == "__main__":
    main()