import math
from collections import defaultdict

def main():
    n = int(input())

    if n == 1:
        print(0)
        return

    p_map = defaultdict(int)
    for i in range(2, math.isqrt(n) + 1):
        while n % i == 0:
            p_map[i] += 1
            n //= i
    if n != 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    print(ans)

if __name__ == "__main__":
    main()