import sys

n = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a > b or (n == 1 and a != b):
    print(0)
    return
if a == b:
    print(1)
    return

print((n - 2) * (b - a) + 1)