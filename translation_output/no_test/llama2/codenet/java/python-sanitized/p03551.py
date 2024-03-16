import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

base = n*100+m*1800

print(base << m)