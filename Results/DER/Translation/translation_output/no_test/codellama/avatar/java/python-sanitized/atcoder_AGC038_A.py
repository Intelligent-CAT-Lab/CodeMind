import sys

h, w, a, b = map(int, sys.stdin.readline().split())

for i in range(h):
    for j in range(w):
        if j < a ^ i < b:
            print(1, end="")
        else:
            print(0, end="")
    print()