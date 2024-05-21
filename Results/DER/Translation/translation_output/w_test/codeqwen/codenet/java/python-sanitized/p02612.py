def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        ans = 1000 * (x + 1) - n
        return ans

n = int(input())
print(solve(n))