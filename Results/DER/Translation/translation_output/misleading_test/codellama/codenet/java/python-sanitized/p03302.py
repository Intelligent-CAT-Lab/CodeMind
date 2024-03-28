import sys

a, b = map(int, sys.stdin.readline().split())

if a + b == 15:
    print("+")
elif a * b == 15:
    print("*")
else:
    print("x")