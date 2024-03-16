import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
c = int(sys.stdin.readline())

if a+b+c >= 22:
    print("bust")
else:
    print("win")