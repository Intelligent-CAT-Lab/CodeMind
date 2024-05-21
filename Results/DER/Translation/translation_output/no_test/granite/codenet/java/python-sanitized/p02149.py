import sys

max_val = 0
max_idx = 0
for i, x in enumerate(map(int, sys.stdin.read().split())):
    if x > max_val:
        max_val = x
        max_idx = i
print(chr(ord('A') + max_idx))