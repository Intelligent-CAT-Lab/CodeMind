import sys

x = int(input())
a = int(input())
b = int(input())

if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")