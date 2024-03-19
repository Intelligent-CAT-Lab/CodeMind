import sys

def p03481():
    X, Y = map(int, sys.stdin.readline().split())

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

p03481()