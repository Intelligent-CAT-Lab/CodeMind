import sys

n, k = map(int, sys.stdin.readline().split())

left = 1
right = k + 1

while right - left > 1:
    mid = (left + right) // 2
    x = mid
    total = 0
    for _ in range(n):
        total += x
        x //= 2
    if total <= k:
        left = mid
    else:
        right = mid

print(left)