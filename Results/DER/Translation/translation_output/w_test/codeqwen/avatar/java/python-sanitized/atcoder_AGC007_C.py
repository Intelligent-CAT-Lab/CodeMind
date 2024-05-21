import decimal

def main():
    N = float(input())
    d = float(input())
    x = float(input())

    ans = decimal.Decimal('0.0')

    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N + 1.0) * d / N + (5.0 * x) / (2.0 * N)
        x = (1.0 + (2.0 / N)) * x
        N -= 1

    print(ans)

if __name__ == "__main__":
    main()