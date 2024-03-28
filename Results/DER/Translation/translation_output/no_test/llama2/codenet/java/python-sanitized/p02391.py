import sys

cmd = sys.stdin.readline()
x, y = map(int, cmd.split())

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")