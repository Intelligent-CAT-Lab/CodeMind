import sys

S = sys.stdin.readline().strip()
a = S.count('a')
b = S.count('b')
c = S.count('c')

if abs(a-b) <= 1 and abs(b-c) <= 1 and abs(a-c) <= 1:
    print('YES')
else:
    print('NO')