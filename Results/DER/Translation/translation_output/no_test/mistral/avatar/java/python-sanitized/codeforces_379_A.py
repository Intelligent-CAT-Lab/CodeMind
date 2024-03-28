import sys

a = int(input())
b = int(input())
res = a

while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

print(res)