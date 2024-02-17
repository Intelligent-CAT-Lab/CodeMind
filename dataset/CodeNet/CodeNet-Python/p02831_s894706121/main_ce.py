import fractions
a, b = map(int, "2 3".split())
print(a*b//fractions.gcd(a, b))