import decimal

N, d, x = map(decimal.Decimal, input().split())
ans = decimal.Decimal(0.0)

while N > decimal.Decimal(0.5):
    adnum = d + x * (N - decimal.Decimal(0.5))
    ans += adnum
    d = (N + decimal.Decimal(1.0)) * d / N + (decimal.Decimal(5.0) * x) / (decimal.Decimal(2.0) * N)
    x = (decimal.Decimal(1.0) + (decimal.Decimal(2.0) / N)) * x
    N -= decimal.Decimal(1.0)

print(ans)