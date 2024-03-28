import sys
import io
import time
import math

sys.stdin = io.StringIO(INPUT)

def solve():
    n = int(input())
    mod = 1000000007
    total = pow(10, n, mod)
    partial = 2 * pow(9, n, mod)
    both = pow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

def main():
    S = time.time()
    solve()
    G = time.time()
    print(G-S, "ms")

if __name__ == "__main__":
    main()