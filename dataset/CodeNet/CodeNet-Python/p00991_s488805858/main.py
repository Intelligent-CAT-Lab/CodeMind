# Edit: 2014/09/17
# Lang: Python3
# Time: 00.04s

from math import factorial

if __name__ == "__main__":
    r, c, ar, ac, br, bc = map(int, input().strip("\n").split(" "))
    maxans = 100000007  # 100,000,007

    # tate Row
    dr = min(abs(br - ar), r - abs(br - ar))
    if 2 * dr == r:
        gainr = 2
    else:
        gainr = 1

    # yoko Column
    dc = min(abs(bc - ac), c - abs(bc - ac))
    if 2 * dc == c:
        gainc = 2
    else:
        gainc = 1

    ans = factorial(dr + dc) // factorial(dr) // factorial(dc) * gainr * gainc

    print(ans % maxans)