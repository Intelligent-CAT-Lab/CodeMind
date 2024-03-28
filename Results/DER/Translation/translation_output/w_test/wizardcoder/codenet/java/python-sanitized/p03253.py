import math

MOD = 1000000007

def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul = (ansMul * (n - i)) % MOD
        ansDiv = (ansDiv * (i + 1)) % MOD
    ans = (ansMul * pow(ansDiv, MOD - 2)) % MOD
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if n & 1 == 1:
            ans = (ans * x) % MOD
        x = (x * x) % MOD
        n >>= 1
    return ans

def main():
    n, m = map(int, input().split())
    res = m
    ans = 1
    for i in range(2, int(math.sqrt(res)) + 1):
        cnt = 0
        while res % i == 0:
            cnt += 1
            res //= i
        ans = (ans * calcComb(cnt + n - 1, n - 1)) % MOD
    if res!= 1:
        ans = (ans * calcComb(n, 1)) % MOD
    print(ans)

if __name__ == '__main__':
    main()