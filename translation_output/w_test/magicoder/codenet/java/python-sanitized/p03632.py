import sys

def overlap(a, b, c, d):
    start = max(a, c)
    end = min(b, d)
    return max(end - start, 0)

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    print(overlap(a, b, c, d))