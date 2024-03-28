a = input()
b = list(a)
c = len(a)

if c == 3:
    str = b[0]
    b[0] = b[2]
    b[2] = str

for i in range(c):
    print(b[i], end='')