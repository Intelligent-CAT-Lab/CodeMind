import math

def main():
    # Create a list to store divisors (not used in the actual solution)
    yaku = []

    p, q = map(int, input().split())
    bp, bq = p, q
    buf = p

    while bq % bp != 0:
        buf = bq % bp
        bq, bp = bp, buf

    qs = q // buf
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