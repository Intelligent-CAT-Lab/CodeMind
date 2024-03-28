import sys

a, b, c = map(int, sys.stdin.readline().split())

sum = [a, b, c]
sum.sort()

print(sum[0] + sum[1])