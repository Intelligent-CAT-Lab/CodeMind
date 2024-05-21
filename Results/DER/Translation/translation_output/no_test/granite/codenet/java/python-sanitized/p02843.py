import sys

x = int(sys.stdin.read())
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)