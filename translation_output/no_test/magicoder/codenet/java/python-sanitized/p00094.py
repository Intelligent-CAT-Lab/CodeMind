import sys

for line in sys.stdin:
    a, b = map(float, line.split())
    print(a * b / 3.305785)