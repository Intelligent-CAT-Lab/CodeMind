import sys

x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
z = int(sys.stdin.readline())

t = 0
for i in range(x, y+1):
    if z % i == 0:
        t += 1

print(t)