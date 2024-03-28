import sys

def solve(H, R):
    if H < 0 and abs(H) == R:
        return 0
    elif H + R > 0:
        return 1
    else:
        return -1

for line in sys.stdin:
    H, R = map(int, line.split())
    print(solve(H, R))