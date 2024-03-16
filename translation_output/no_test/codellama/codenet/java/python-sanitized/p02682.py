import sys

a, b, c, d = map(int, sys.stdin.readline().split())

if d <= a:
    print(d)
    sys.exit()

sum = a
d -= a

if d <= b:
    print(sum)
    sys.exit()

d -= b
sum -= d

print(sum)