import sys

def solve():
    n = int(sys.stdin.readline())
    mod = 1000000007
    total = pow(10, n, mod)
    partial = 2 * pow(9, n, mod)
    both = pow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

if __name__ == '__main__':
    solve()