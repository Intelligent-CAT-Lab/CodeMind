import sys

h, w, a, b = map(int, sys.stdin.readline().split())

for i in range(h):
    for j in range(w):
        if i < b:
            if j < a:
                print(0, end='')
            else:
                print(1, end='')
        else:
            if j < a:
                print(1, end='')
            else:
                print(0, end='')
    print()