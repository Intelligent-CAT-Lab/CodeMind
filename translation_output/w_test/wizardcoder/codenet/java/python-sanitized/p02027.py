import math

dp = {}

def search(num, count, max):
    if count == 0:
        return 1
    if num in dp and count in dp[num]:
        return dp[num][count]
    total = 0
    for i in range(2, int(math.pow(2, count)) + 1):
        if num * i * math.pow(2, count - 1) <= max:
            total += search(num * i, count - 1, max)
    if num in dp:
        dp[num][count] = total
    else:
        dp[num] = {count: total}
    return total

n, k = map(int, input().split())
total = 0
for i in range(1, int(math.pow(2, k - 1)) + 1):
    total += search(i, k - 1, n)
print(total)