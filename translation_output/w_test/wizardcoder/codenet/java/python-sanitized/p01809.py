import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    p, q = map(int, input().split())
    ans = 1
    while q % p!= 0:
        r = q % p
        q = p
        p = r
    qs = q // p
    for i in range(2, int(math.sqrt(qs))+1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

if __name__ == '__main__':
    main()