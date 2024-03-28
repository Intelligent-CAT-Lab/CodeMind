import sys

a, b, x = map(int, sys.stdin.readline().split())
s = a - b
count = max(x - a, 0) // s
total = (count % 1000000007) * (a % 1000000007) % 1000000007
x -= count * s
while x >= a:
    total += a
    x += - a + b
total += x
total %= 1000000007
print(total)