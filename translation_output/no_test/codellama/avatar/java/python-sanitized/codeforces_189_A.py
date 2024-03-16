import sys

n = int(input())
a = list(map(int, input().split()))

d = [0] * (n + 1)

for i in range(n + 1):
    for j in range(3):
        if i - a[j] >= 0 and d[i - a[j]] != -1:
            d[i] = max(d[i], d[i - a[j]] + 1)

print(d[n])