a, b, c = [int(x) for x in input().split()]
print(min(a+b, b+c, c+a))