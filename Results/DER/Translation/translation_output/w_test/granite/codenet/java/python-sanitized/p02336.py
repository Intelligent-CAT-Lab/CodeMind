import sys

MOD = 1000000007

def main():
    n, k = map(int, input().split())
    fact = [1] * (n + 1)
    for i in range(1, n + 1):
        fact[i] = fact[i - 1] * i % MOD
    ans = fact[n - 1] * pow(fact[k], MOD - 2, MOD) * pow(fact[n - k], MOD - 2, MOD) % MOD
    print(ans)

if __name__ == '__main__':
    input = sys.stdin.readline
    main()