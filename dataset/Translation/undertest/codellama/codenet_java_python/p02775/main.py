import math

def run():
    sc = input()
    N = "0" + sc
    l = len(N)

    # 0 ãã¤ã, 1 ã´ã£ãã, 2 å¤ã
    dp = [[0] * 3 for _ in range(l + 1)]

    dp[0][0] = dp[0][2] = 1

    for i in range(1, l):
        c = int(N[i]) - 0
        dp[i][0] = min(dp[i - 1][0], dp[i - 1][2]) + 9 - c
        dp[i][1] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c
        dp[i][2] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1

    dp[l - 1][0] += 1
    print(min(dp[l - 1][0], min(dp[l - 1][1], dp[l - 1][2])))

if __name__ == "__main__":
    run()