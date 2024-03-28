import sys
import math

def solve(n):
    pf = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        c = 0
        while n % i == 0:
            n //= i
            c += 1
        if c > 0:
            pf[i] = c
    if n > 1:
        pf[n] = 1

    ans = 1
    for val in pf.values():
        ans *= (val + 1)

    return len(pf), ans - 1

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    result = solve(n)
    print(*result)