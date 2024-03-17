import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
else:
    c = (w*h)%2 == 0? (w*h)/2 : (w*h)/2+1
    print(c)