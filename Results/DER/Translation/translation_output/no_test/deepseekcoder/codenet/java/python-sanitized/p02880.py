import sys

def p02880():
    N = int(sys.stdin.readline().strip())
    f = False
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            f = True
    print("Yes" if f else "No")

p02880()