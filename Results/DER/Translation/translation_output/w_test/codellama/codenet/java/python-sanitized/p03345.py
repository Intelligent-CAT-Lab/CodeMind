import math

def solve(a, b, c, k):
    ans = a - b
    if abs(ans) > 10**18:
        return "Unfair"
    if k % 2 == 0:
        return ans
    else:
        return -ans

a = 1
b = 2
c = 3
k = 1
print(solve(a, b, c, k))