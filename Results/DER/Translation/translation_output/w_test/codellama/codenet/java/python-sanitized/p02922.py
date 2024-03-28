import sys

a, b = map(int, sys.stdin.readline().split())

ans = (b - 1) // (a - 1)
if (b - 1) % (a - 1) == 0:
    print(ans)
else:
    print(ans + 1)