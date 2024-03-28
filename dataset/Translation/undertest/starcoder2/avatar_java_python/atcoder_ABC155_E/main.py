import sys

mod = 1000000007

def main():
    S = "0" + input()
    c = list(S)
    N = len(c)
    dp = [[0 for i in range(2)] for j in range(N+1)]
    dp[N][0] = int(c[0])
    dp[N][1] = 10 - int(c[0])

    for i in range(N-1, -1, -1):
        for j in range(2):
            for k in range(10):
                tmp = int(c[i]) + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i+1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i+1][j] + tmp + k)

    print(dp[0][0])

if __name__ == "__main__":
    main()