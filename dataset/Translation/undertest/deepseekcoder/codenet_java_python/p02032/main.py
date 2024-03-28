import sys
import math
from collections import Counter

def solve(n):
    pf = Counter()
    for i in range(2, int(math.sqrt(n)) + 1):
        while n % i == 0:
            n /= i
            pf[i] += 1
    if n > 1:
        pf[n] += 1

    ans = 1
    for ent in pf.values():
        ans *= (ent + 1)
    return len(pf), ans - 1

def main():
    n = int(sys.stdin.readline())
    pf_size, ans = solve(n)
    print(pf_size, ans)

if __name__ == "__main__":
    main()