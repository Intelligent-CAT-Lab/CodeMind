def p02439():
    a, b, c = map(int, input().split())
    minimum = min(a, b)
    maximum = max(a, b)
    print(min(minimum, c), max(maximum, c))

# Sample Test Case
p02439()