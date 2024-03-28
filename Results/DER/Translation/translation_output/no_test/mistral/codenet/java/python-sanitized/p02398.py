import sys

x = int(input())
y = int(input())
z = int(input())
t = 0
for i in range(x, y+1):
    if z % i == 0:
        t += 1
print(t)