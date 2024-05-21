import sys

def c(n, k):
    if k > n - k:
        k = n - k
    res = 1
    for i in range(k):
        res *= (n - i)
        res //= (i + 1)
    return res

def fact(n):
    res = 1
    for i in range(2, n + 1):
        res *= i
    return res

def main():
    n = int(input())
    md = [0] * n
    rm = n - 2
    lx = n - 2
    while rm >= 0:
        md[lx + 1] = c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, n):
        cur = fact(m) * fact(n - m - 1) % 100000007
        cur = cur * md[m] % 100000007
        res += (cur - prev + 100000007) * m % 100000007
        prev = cur
    print(res % 100000007)

if __name__ == "__main__":
    main()