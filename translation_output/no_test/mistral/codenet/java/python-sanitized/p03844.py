import sys

a = int(input())
s = input()
b = int(input())

if s == "+":
    c = a + b
elif s == "-":
    c = a - b
else:
    c = 0

print(c)