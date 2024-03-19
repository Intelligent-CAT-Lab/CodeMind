from collections import defaultdict

def p02027(n, k):
    total = 0
    for i in range(1, int(1 << k) + 1):
        total += search(i, k - 1, n)
    return total

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp:
        if count in dp[num]:
            return dp[num][count]
    else:
        total = 0
        for i in range(2, int(num * 2 ** (count - 1)) + 1):
            total += search(num * i, count - 1, max)
        if num in dp:
            dp[num][count] = total
        else:
            dp[num] = defaultdict(int)
            dp[num][count] = total
    return total

n = int(input())
k = int(input())
print(p02027(n, k))