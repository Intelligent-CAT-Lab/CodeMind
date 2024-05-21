import sys

def solve(S):
    dp = [1] + [0]*12
    base = 1
    for c in S[::-1]:
        if c == '?':
            for k in range(10):
                for j in range(13):
                    dp[(k*base+j)%13] += dp[j]
                    dp[(k*base+j)%13] %= 1000000007
        else:
            k = int(c)
            for j in range(13):
                dp[(k*base+j)%13] += dp[j]
                dp[(k*base+j)%13] %= 1000000007
        base *= 10
        base %= 13
    return dp[5]

if __name__ == "__main__":
    S = sys.stdin.readline().strip()
    print(solve(S))