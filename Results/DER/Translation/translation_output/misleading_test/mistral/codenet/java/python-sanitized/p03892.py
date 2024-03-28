import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def solve():
    a, b = map(int, input().split())
    a, b = abs(a - ni()), abs(b - ni())
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

def ni():
    n = int(input())
    res = []
    for i in range(n):
        res.append(int(input()))
    return res

def main():
    solve()

if __name__ == "__main__":
    main()