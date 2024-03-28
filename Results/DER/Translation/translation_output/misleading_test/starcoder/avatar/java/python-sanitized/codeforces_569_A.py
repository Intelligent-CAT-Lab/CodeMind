import sys

t = int(sys.stdin.readline())
s = int(sys.stdin.readline())
q = int(sys.stdin.readline())

sum = 0
while s < t:
    s = s * q
    sum += 1

print(sum)