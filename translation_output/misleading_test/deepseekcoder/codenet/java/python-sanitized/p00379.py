import math

def solve(a, n, m):
    max_val = int(math.pow(m, 1 / n))
    ans = 0
    for i in range(1, max_val + 1):
        x = i ** n
        y = sum(int(digit) for digit in str(x))
        if y + a == i:
            ans += 1
    return ans

a, n, m = map(int, input().split())
print(solve(a, n, m))