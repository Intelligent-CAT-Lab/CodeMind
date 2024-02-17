a, b, c, d = map(int, "2 1 3 4".split())
x = [a+b-c-d, a+c-b-d, a+d-b-c, b+c-a-d, b+d-a-c, c+d-a-b]
print(min(map(abs, x)))
