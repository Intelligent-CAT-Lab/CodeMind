import sys

while True:
    try:
        x, y = map(float, sys.stdin.readline().split())
        print(x*y/3.305785)
    except EOFError:
        break