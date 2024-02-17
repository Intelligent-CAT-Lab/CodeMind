import fractions
a, b = map(int, input().split())
print(a*b//fractions.gcd(a, b))