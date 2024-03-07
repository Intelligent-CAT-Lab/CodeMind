import sys

a, s, b = map(int, input().split())

if s == "+":
    c = a + b
elif s == "-":
    c = a - b

print(c)