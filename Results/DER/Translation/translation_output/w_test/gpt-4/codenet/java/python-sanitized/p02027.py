from collections import defaultdict

dp = defaultdict(lambda: defaultdict(int))

def search(num, count, max_val):
    if count == 0:
        return 1
    if count in dp[num]:
        return dp[num][count]
    total = 0
    i = 2
    while num * i * (2 ** (count - 1)) <= max_val:
        total += search(num * i, count - 1, max_val)
        i += 1
    dp[num][count] = total
    return total

n, k = map(int, input().split())
total = 0
for i in range(1, n + 1):
    if i * (2 ** (k - 1)) <= n:
        total += search(i, k - 1, n)
print(total)