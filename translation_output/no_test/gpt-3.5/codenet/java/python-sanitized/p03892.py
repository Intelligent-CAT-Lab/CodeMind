import sys

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    def ni():
        return int(sys.stdin.readline())

    a, b = ni(), ni()
    a = abs(ni() - a)
    b = abs(ni() - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()