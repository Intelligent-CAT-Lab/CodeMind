a="1 5 2".strip().split(" ")
b=[int(i) for i in a]
b.sort()
print(b[2]*10+b[1]+b[0])
