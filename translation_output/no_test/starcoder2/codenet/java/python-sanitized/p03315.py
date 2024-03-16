import sys

ary = sys.stdin.readline().strip()
num = 0
for c in ary:
    if c == '+':
        num += 1
    else:
        num -= 1
print(num)