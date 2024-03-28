import sys

x = int(sys.stdin.readline())
i = 1
while i * (i + 1) / 2 < x:
    i += 1
print(i)