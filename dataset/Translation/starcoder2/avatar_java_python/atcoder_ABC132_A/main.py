import sys

s = sys.stdin.readline().strip()
chars = set(s)
if len(chars) == 2:
    print("Yes")
else:
    print("No")