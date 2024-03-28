import sys

line = sys.stdin.readline().split()

h = int(line[0])
a = int(line[1])

n = h//a
if h%a > 0:
    n += 1

print(n)