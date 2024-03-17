import sys

o, n, g = map(int, input().split())
x = 0

for i in range(1, g+1):
    x = x + i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)