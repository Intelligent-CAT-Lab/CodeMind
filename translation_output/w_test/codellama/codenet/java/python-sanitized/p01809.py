import math

def main():
    p, q = map(int, input().split())
    qs = q // math.gcd(p, q)
    ans = 1
    for i in range(2, int(math.sqrt(qs)) + 1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

if __name__ == "__main__":
    main()