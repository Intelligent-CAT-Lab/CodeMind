import sys
from collections import defaultdict

MOD = 998244353

def solve(n, x, d):
    if d == 0:
        if x == 0:
            return 1
        else:
            return n + 1

    if x == 0:
        return 1 + n * (n - 1) // 2

    m = defaultdict(list)

    for take in range(n + 1):
        b = take * x
        sum_ = take * (take - 1) // 2
        rsum = (n - take) * take + sum_
        c = b // d
        add(m, b % d, (c + sum_, c + rsum))

    ans = 0
    for k, v in m.items():
        v = sorted(v, key=lambda p: (p[0], p[1]))
        l = r = 0
        f = False
        for p in v:
            if not f:
                f = True
                l, r = p
            else:
                if p[0] <= r:
                    r = max(r, p[1])
                else:
                    ans += r - l + 1
                    l, r = p
        ans += r - l + 1

    return ans

def add(m, k, v):
    m[k].append(v)

def power(a, b):
    x, y = 1, a
    while b > 0:
        if b % 2 != 0:
            x = (x * y) % MOD
        y = (y * y) % MOD
        b //= 2
    return x % MOD

def gcd(a, b):
    while a != 0:
        tmp = b % a
        b = a
        a = tmp
    return b

def main():
    input = sys.stdin.readline
    T = 1
    for _ in range(T):
        n, x, d = map(int, input().split())
        print(solve(n, x, d))

if __name__ == "__main__":
    main()