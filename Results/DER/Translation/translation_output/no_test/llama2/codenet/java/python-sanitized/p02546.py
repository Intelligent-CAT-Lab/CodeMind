import sys

s = sys.stdin.readline()
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")