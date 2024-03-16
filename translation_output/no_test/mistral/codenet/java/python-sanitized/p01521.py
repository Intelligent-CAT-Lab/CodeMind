import sys

c = sys.stdin.readline().strip()
print("x" in c and "x" in c[-1] ? "x" : "o")