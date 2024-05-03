import math

def search(num, count, max):
    if count == 0:
        return 1
    if (num, count) in dp:
        return dp[(num, count)]
    total = 0
    for i in range(2, int(math.pow(2, count - 1)) + 1):
        if num * i * math.pow(2, count - 1) <= max:
            total += search(num * i, count - 1, max)
    dp[(num, count)] = total
    return total

dp = {}
n = int(input())
k = int(input())
total = 0
for i in range(1, int(math.pow(2, k - 1)) + 1):
    total += search(i, k - 1, n)
print(total)