import sys

x = [int(x) for x in sys.stdin.read().split()]
sum = sum(x)
print(15 - sum)