import sys

a = int(input())
b = int(input())
n = int(input())

if n >= b:
    print(a * (b - 1) // b)
else:
    print(a * n // b)