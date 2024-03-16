import sys

N = int(sys.stdin.readline())
K = int(sys.stdin.readline())

ans = K
for i in range(2, N+1):
    ans *= K-1

print(ans)