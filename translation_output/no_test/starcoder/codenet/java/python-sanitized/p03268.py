import sys

n, k = map(int, sys.stdin.readline().split())

num = [0] * k

for i in range(1, n + 1):
    num[i % k] += 1

res = 0
for a in range(k):
    b = (k - a) % k
    c = (k - a) % k
    if (b + c) % k!= 0:
        continue
    res += num[a] * num[b] * num[c]

print(res)