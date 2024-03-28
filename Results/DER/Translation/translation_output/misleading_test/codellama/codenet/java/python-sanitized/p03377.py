import sys

a, b, x = map(int, sys.stdin.readline().split())

if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")