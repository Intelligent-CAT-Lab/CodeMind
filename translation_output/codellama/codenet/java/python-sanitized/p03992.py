import sys

X = sys.stdin.readline().strip()

for i, c in enumerate(X):
    if i == 4:
        print(c, end=" ")
    else:
        print(c, end="")