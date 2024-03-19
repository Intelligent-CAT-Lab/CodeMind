import sys

A, B, C, D, E, F = map(int, sys.stdin.readline().split())
ans1, ans2 = 0, 0

for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d) <= E / 100:
                    if a == 0 and b == 0:
                        continue
                    if (ans2 / ans1) < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                        ans1, ans2 = 100 * a * A + 100 * b * B + C * c + D * d, C * c + D * d

print(int(ans1) + int(ans2))