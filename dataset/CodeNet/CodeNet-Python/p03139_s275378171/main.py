n, a, b = map(int, input().split())

maximum = min(a,b)
minimum = max(0, a+b-n)

print(maximum, minimum)