import sys

n = int(sys.stdin.readline())
ans = 0
for i in range(1, n + 1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)