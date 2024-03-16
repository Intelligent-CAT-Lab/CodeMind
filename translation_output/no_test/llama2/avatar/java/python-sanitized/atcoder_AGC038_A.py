import sys

h, w, a, b = map(int, sys.stdin.readline().split())

for i in range(h):
    for j in range(w):
        if j < a ^ i < b:
            sys.stdout.write('1')
        else:
            sys.stdout.write('0')
    sys.stdout.write('\n')