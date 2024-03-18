A, B, C, D, E, F = map(int, input().split())

ans1 = A * 100
ans2 = 0

for a in range(0, F // (A * 100) + 1):
    for b in range(0, F // (B * 100) + 1):
        for c in range(0, F // C + 1):
            for d in range(0, F // D + 1):
                total_water = 100 * a * A + 100 * b * B
                total_sugar = C * c + D * d
                total_mixture = total_water + total_sugar
                if total_mixture <= F and total_sugar <= total_water * E / 100:
                    if a == 0 and b == 0:
                        continue
                    concentration = total_sugar / total_mixture
                    if ans2 / ans1 < concentration:
                        ans1 = total_mixture
                        ans2 = total_sugar

print(int(ans1), int(ans2))