import sys

s = sys.stdin.readline().strip()

if s[0] == s[-1]:
    if len(s) % 2 == 1:
        print("First")
    else:
        print("Second")
else:
    if len(s) % 2 == 1:
        print("Second")
    else:
        print("First")