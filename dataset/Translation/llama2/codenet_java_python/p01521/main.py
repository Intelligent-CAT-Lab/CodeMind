import sys

c = sys.stdin.readline().strip()
if c[0] == 'x' and c[len(c)-1] == 'x':
    print('x')
else:
    print('o')