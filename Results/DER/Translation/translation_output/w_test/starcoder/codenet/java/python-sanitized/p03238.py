import sys

n = int(sys.stdin.readline())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)