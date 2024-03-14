import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def main():
    p, q = map(int, input().split())
    g = gcd(p, q)
    q //= g
    ans = 1
    for i in range(2, int(math.sqrt(q)) + 1):
        if q % i == 0:
            while q % i == 0:
                q //= i
            ans *= i
    ans *= q
    print(ans)

if __name__ == "__main__":
    main()