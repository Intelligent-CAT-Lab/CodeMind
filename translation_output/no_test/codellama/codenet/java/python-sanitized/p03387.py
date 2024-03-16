import math
import sys

x = list(map(int, sys.stdin.readline().split()))
x.sort()
temp = 2 * x[2] - x[1] - x[0]
ans = temp // 2 if temp % 2 == 0 else (temp + 2) // 2 + 1
print(ans)