import sys

h, w, a, b = map(int, sys.stdin.readline().split())

s1 = ''.join('0' if i < a else '1' for i in range(w))
s2 = ''.join('1' if i < a else '0' for i in range(w))

for i in range(h):
    if i < b:
        print(s1)
    elif i >= b:
        print(s2)