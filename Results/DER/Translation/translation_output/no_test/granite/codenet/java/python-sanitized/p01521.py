import sys

c = sys.stdin.read().strip()

if c[0] == 'x' and c[-1] == 'x':
    print('x')
else:
    print('o')