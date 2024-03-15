import sys

def num_of_subarrays(nums):
    n = len(nums)
    dp = [[[0 for _ in range(10)] for _ in range(10)] for _ in range(10)]
    dp[0][0][0][0][0][1] = 1
    counts = [[0, 0] for _ in range(n + 1)]
    for i in range(1, n + 1):
        for a in range(10):
            for b in range(10):
                for c in range(10):
                    for d in range(10):
                        for e in range(10):
                            dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][0]
                            if e < nums[i - 1]:
                                dp[i][b][c][d][e][0] += dp[i - 1][a][b][c][d][1]
                            elif e == nums[i - 1]:
                                dp[i][b][c][d][e][1] += dp[i - 1][a][b][c][d][1]
                    counts[i][0] += counts[i - 1][0]
                    if e < nums[i - 1]:
                        counts[i][0] += counts[i - 1][1]
                    elif e == nums[i - 1]:
                        counts[i][1] += counts[i - 1][1]
    return counts[n][0] + counts[n][1]


if __name__ == "__main__":
    nums = list(map(int, sys.stdin.readline().strip().split()))
    print(num_of_subarrays(nums))