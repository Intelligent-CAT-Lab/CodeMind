n, a, b = map(int, "10 3 5".split())
maximum = min(a,b)
minimum = max(0, a+b-n)
print(maximum, minimum)