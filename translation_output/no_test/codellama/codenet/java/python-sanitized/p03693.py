import sys

r, g, b = map(int, sys.stdin.readline().split())

sum = r * 100 + g * 10 + b

if sum % 4 == 0:
    print("YES")
else:
    print("NO")