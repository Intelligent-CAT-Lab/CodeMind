import sys

def solve(n):
    md = [0] * (n + 1)
    rm = n - 2
    lx = n - 2
    while rm >= 0:
        md[lx + 1] = (rm + 1) * (lx + 1) % 1000000007
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, n):
        cur = (m + 1) * (n - m - 1) % 1000000007
        cur = cur * md[m] % 1000000007

        res += (cur - prev + 1000000007) * m % 1000000007
        prev = cur

    return res % 1000000007


if __name__ == "__main__":
    n = int(input())
    print(solve(n))