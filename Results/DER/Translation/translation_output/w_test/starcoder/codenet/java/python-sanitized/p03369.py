import sys

s = sys.stdin.readline().strip()

print(len(s) - s.count('o')*100 + 700)