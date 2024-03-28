import sys

MOD = 1000000007

def primeFactorize(n):
    res = []
    for a in range(2, n+1):
        if n % a!= 0:
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n /= a
        res.append({a: ex})
    if n!= 1:
        res.append({n: 1})
    return res

def main():
    n = int(sys.stdin.readline())

    ex = [0] * 1001
    for i in range(2, n+1):
        for pf in primeFactorize(i):
            for k, v in pf.items():
                ex[k] += v

    ans = 1
    for i in range(2, n+1):
        ans *= ex[i] + 1
        ans %= MOD

    print(ans)

if __name__ == '__main__':
    main()