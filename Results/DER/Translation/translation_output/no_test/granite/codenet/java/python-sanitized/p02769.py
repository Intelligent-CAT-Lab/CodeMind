import sys

def nCr(n, r, p):
    # initialize numerator
    # and denominator
    num = den = 1
    for i in range(r):
        num = (num * (n - i)) % p
        den = (den * (i + 1)) % p
    return (num * pow(den,
                      p - 2, p)) % p

def power(x, y, p) :
    res = 1     # Initialize result
    x = x % p  # Update x if it is more
                # than or equal to p
    while (y > 0) :
        # If y is odd, multiply x
        # with result
        if ((y & 1) == 1) :
            res = (res * x) % p
        # y must be even now
        y = y >> 1      # y = y/2
        x = (x * x) % p
    return res

def main():
    n, k = map(int, sys.stdin.readline().split())
    mod = 1000000007
    if k >= n:
        print(nCr(n + n - 1, n - 1, mod))
    else:
        ans = 0
        for i in range(k + 1):
            up = (n * fact[n]) % mod
            den1 = (fact[i] * fact[i]) % mod
            den2 = (fact[n - i] * fact[n - i - 1]) % mod
            den = (den1 * den2) % mod
            ans += (up * den) % mod
        print(ans % mod)

if __name__ == "__main__":
    fact = [1] * 200005
    for i in range(1, 200005):
        fact[i] = (fact[i - 1] * i) % 1000000007
    main()