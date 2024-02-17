a=input().strip().split(" ")
b=[int(i) for i in a]

b.sort()

print((b[2]*10+b[1]+b[0]))
