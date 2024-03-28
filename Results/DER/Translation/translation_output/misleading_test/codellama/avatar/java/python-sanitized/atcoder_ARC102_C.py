import sys

mod = 998244353
nchoosek = [[1, 1], [1, 0]]

def nchoosek(n, k):
    if k < 0 or k > n:
        return 0
    if k == 0 or k == n:
        return 1
    if nchoosek[n][k] != 0:
        return nchoosek[n][k]
    nchoosek[n][k] = (nchoosek(n - 1, k - 1) + nchoosek(n - 1, k)) % mod
    return nchoosek[n][k]

def main():
    k, n = map(int, sys.stdin.readline().split())
    for i in range(2, 2 * k + 1):
        pairs = k - i // 2 if i > k else (i - 1) // 2
        active = k - 2 * pairs
        if i % 2 == 0:
            active -= 1
        times2 = 1
        total = 0
        for j in range(0, pairs + 1):
            choice = times2 * nchoosek(pairs, j) % mod
            times2 = times2 * 2 % mod
            if active + j - 1 < 0:
                continue
            total += choice * nchoosek(n + active - 1, active + j - 1)
            if i % 2 == 0:
                total += choice * nchoosek(n + active - 2, active + j - 1)
            total %= mod
        print(total)

if __name__ == "__main__":
    main()