def mod_inv(a, m):
    if a % m <= 1:
        return 1
    return ((1 - mod_inv(m % a, a) * m) // a + m) % m

def main():
    M = 998244353
    n, a, b, k = map(int, input().split())
    ans = 0
    nck = [1] * (n + 1)
    for i in range(1, n + 1):
        nck[i] = nck[i - 1] * (n - i + 1) % M * mod_inv(i, M) % M
    for i in range(n + 1):
        if a * i <= k and (k - a * i) % b == 0:
            j = (k - a * i) // b
            if j <= n:
                ans += nck[i] * nck[j] % M
    print(ans % M)

if __name__ == "__main__":
    main()