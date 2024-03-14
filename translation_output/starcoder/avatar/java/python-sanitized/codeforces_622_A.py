import math
n1 = int(input())
n = int(math.sqrt(1 + (8 * n1)) - 1) // 2
ans = n1 - (((n + 1) * n) // 2)
print(ans if ans else n)