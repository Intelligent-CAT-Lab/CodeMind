import sys

n, m = map(int, sys.stdin.readline().split())

print(int(n / m) * " " + str(int(ceil(n / m))))