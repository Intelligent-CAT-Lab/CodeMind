import sys

def modI(a, m):
    if (a % m <= 1):
        return 1
    return ((1 - modI(m % a, a) * m) % m + m) % m

def nck(n):
    nck = [1]
    for i in range(2, n + 1):
        nck.append(nck[i - 1] * (n - i + 1) % 1000000007)
    return nck

def main():
    n, a, b, k = map(int, sys.stdin.readline().split())
    ans = 0
    nck = nck(n)
    for i in range(n):
        if (a * i <= k and (k - a * i) % b == 0 and (k - a * i) // b <= n):
            ans += nck[i] * nck[(k - a * i) // b] % 1000000007
    print(ans % 1000000007)

if __name__ == "__main__":
    main()