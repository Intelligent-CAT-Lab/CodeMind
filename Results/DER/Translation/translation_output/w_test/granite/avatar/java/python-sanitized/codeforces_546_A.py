import sys

o, n, g = map(int, sys.stdin.readline().split())
borrow = sum(i * o for i in range(1, g + 1)) - n
print(max(borrow, 0))