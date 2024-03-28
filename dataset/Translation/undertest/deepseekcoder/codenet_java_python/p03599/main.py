import sys

def solve():
    A, B, C, D, E, F = map(int, sys.stdin.readline().split())
    ans1 = 0
    ans2 = 0
    for a in range(int(F / (A * 100)) + 1):
        for b in range(int(F / (B * 100)) + 1):
            for c in range(int(F / C) + 1):
                for d in range(int(F / D) + 1):
                    total = 100 * a * A + 100 * b * B + C * c + D * d
                    if total > F or (C * c + D * d) / (a * A * 100 + b * B * 100) > E / 100:
                        continue
                    if a == 0 and b == 0:
                        continue
                    if ans2 / ans1 < (C * c + D * d) / total:
                        ans1 = total
                        ans2 = C * c + D * d
    print(int(ans1), int(ans2))

solve()