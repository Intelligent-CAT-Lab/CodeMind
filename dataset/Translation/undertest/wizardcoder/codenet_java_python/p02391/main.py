import sys

CMD = sys.stdin.readline().strip()
x, y = map(int, CMD.split())

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
else:
    print("a > b")