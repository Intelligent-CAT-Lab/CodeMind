#!/usr/bin/env python3
INF = 2 ** 63 - 1
def solve(a, b, n):
    # a + x = k * d, b = l * g
    # 1 <= k <= n, 1 <= l <= n
    x = INF
    for l in range(1, n + 1):
        d, m = divmod(b, l)
        if not m:
            for k in range(1, n + 1):
                x = min(x, abs(k * d - a))
    return x
def main():
    a, b, n = map(int, "19 30 3".split())
    print(solve(a, b, n))
if __name__ == '__main__':
    main()