import sys

n, m = map(int, sys.stdin.readline().split())

if n == 0:
    if m!= 0:
        print("Impossible")
    else:
        print("0 0")
    sys.exit(0)

if m <= n:
    if m == 0:
        m = 1
    print(n, m + n - 1)
    sys.exit(0)

print(m, m + n - 1)