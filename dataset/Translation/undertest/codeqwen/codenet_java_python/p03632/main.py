import sys

for line in sys.stdin:
    inp = list(map(int, line.split()))
    a, b, c, d = inp
    start = max(a, c)
    end = min(b, d)
    print(end - start if end - start > 0 else 0)