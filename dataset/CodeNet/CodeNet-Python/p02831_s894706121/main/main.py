import fractions
a, b = list(map(int, input().split()))
print((a*b//fractions.gcd(a, b)))