import sys

r = int(input())
d = int(input())
x = int(input())

for i in range(10):
    x = r * x - d
    print(x)