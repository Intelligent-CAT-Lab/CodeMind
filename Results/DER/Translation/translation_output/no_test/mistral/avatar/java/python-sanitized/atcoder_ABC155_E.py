import math

def main():
    mod = (10**9 + 7)
    S = input()
    c = list(S)
    N = len(c)
    dp = [[float('inf') for _ in range(2)] for _ in range(N+1)]
    dp[N][0] = ord(c[0]) - ord('0')
    dp[N][1] = 10 - ord(c[0]) - ord('0')

    for i in range(N-1, -1, -1):
        dp[i] = [float('inf') for _ in range(2)]
        for j in range(2):
            for k in range(10):
                tmp = ord(c[i]) + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i+1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i+1][j] + tmp + k)

    print(dp[0][0])

if __name__ == '__main__':
    main()