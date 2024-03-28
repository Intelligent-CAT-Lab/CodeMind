import sys

s = sys.stdin.readline().strip()

if s[0] == 'x' and s[-1] == 'x':
    print('x')
else:
    print('o')