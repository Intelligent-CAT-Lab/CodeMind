import sys
import math

x = [int(i) for i in input().split()]
x.sort()
temp = 2 * x[2] - x[1] - x[0]
ans = temp // 2 + 1 if temp % 2 == 1 else temp // 2
print(ans)