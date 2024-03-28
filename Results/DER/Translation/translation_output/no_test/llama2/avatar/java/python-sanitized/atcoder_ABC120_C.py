import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)