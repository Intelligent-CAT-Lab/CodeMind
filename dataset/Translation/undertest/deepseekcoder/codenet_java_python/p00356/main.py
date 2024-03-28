def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

def solve(x, y):
    m = x + y - gcd(x, y)
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        return m + 1
    else:
        return m

x, y = map(int, input().split())
print(solve(x, y))