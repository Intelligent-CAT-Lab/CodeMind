import sys

count = [0] * 5

for i, x in enumerate(map(int, sys.stdin.read().split())):
    count[i] += x
    if count[i] == 0:
        print(i + 1)
        break