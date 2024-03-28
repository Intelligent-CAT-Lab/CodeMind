import sys

H, A, B = map(int, sys.stdin.readline().split())

ans = 0
for i in range(A, B+1):
    if H % i == 0:
        ans += 1

print(ans)