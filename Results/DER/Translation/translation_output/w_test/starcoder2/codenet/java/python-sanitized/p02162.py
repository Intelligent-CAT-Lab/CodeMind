import sys

t1, t2, r1, r2 = map(int, sys.stdin.readline().split())
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2
if r1 == r2:
    print("Draw")
elif r1 < r2:
    print("Bob")
else:
    print("Alice")