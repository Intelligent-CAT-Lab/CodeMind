import sys

for line in sys.stdin:
    inp = list(map(int, line.split()))
    a = inp[0]
    b = inp[1]
    c = inp[2]
    d = inp[3]

    start = max(a, c)
    end = min(b, d)
    print(end - start if end - start > 0 else 0)