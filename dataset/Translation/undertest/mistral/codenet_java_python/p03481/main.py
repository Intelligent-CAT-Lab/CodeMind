X, Y = map(int, input().split())

i = 0
while X <= Y:
    i += 1
    X *= 2

print(i)