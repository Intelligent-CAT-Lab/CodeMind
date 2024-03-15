import sys

N = int(input()) + 1

# æ¡æ°
s = str(N)
length = len(s)
c = int(s[:1])
max = (c - 1) + 9 * (length - 1)

print(max)