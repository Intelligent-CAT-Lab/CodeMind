import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
res = a

while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

print(res)