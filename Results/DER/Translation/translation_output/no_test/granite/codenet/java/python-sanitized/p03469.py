import sys

S = sys.stdin.readline().strip()
c = list(S)

print(2018, end='')
for i in range(4, len(c)):
    print(c[i], end='')