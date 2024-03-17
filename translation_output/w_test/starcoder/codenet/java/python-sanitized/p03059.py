import sys

a, b, c = map(int, sys.stdin.readline().split())

amount = 0
time = a

for i in range(2, int(c + 0.5)):
    amount += b
    time = a * i

print(amount)