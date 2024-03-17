import sys

x,y = sys.stdin.readline().split()
x = int(x)
y = int(y)

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")