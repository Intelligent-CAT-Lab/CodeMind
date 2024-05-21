import fractions

def gcd(a, b):
    while b!= 0:
        a, b = b, a % b
    return a

def main():
    p, q = map(int, input().split())
    g = gcd(p, q)
    p //= g
    q //= g
    ans = 1
    for i in range(2, int(q ** 0.5) + 1):
        if q % i == 0:
            ans *= i
            while q % i == 0:
                q //= i
    ans *= q
    print(ans)

if __name__ == '__main__':
    main()