import sys

a = sys.stdin.readline()
b = a.split()

c = len(b)

if c == 3:
    b[0], b[2] = b[2], b[0]

for i in range(c):
    print(b[i])