a, b, c = [int(x) for x in "700 600 780".split()]
print(min(a+b, b+c, c+a))