import sys

MOD = 1000000007

def prime_factorize(n):
    factors = []
    for a in range(2, int(n**0.5) + 1):
        if n % a != 0:
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n //= a
        factors.append((a, ex))
    if n != 1:
        factors.append((n, 1))
    return factors

def main():
    n = int(sys.stdin.readline())
    ex = [0] * 1001
    for i in range(2, n+1):
        for a, ex in prime_factorize(i):
            ex[a] += ex
    ans = 1
    for i in range(2, n+1):
        ans *= ex[i] + 1
        ans %= MOD
    print(ans)

if __name__ == "__main__":
    main()