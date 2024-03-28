def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a, b = map(int, input().split())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()