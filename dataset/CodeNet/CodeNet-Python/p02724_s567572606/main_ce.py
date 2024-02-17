X = int("1024")
s = 0
p = 0
while X >= 500:
    X = X - 500
    s = s + 1
while X >= 5:
    X = X - 5
    p = p + 1
print(1000*s+5*p)