import sys
from math import gcd
from sympy import isprime

def main():
    n = int(input())
    if n == 2:
        print("4 7")
        print("23 10")
        return

    snt = []
    x = 2
    while len(snt) < n * 2:
        if isprime(x):
            snt.append(x)
        x += 1

    a = [[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = snt[a1] * snt[a2]

    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            gcd_val = 0
            mul = 1
            for k in range(4):
                if 0 <= i + dx[k] < n and 0 <= j + dy[k] < n:
                    if gcd_val == 0:
                        gcd_val = a[i + dx[k]][j + dy[k]]
                        mul = gcd_val
                    else:
                        gcd_val = gcd(mul, a[i + dx[k]][j + dy[k]])
                        mul = mul // gcd_val * a[i + dx[k]][j + dy[k]]
            a[i][j] = mul + 1

    for row in a:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()