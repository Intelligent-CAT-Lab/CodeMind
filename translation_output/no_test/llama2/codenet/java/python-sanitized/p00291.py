import sys

a = [int(x) for x in sys.stdin.readline().split()]

b = 0
for i in range(len(a)):
    b += a[i]

if b >= 1000:
    print("1")
else:
    print("0")