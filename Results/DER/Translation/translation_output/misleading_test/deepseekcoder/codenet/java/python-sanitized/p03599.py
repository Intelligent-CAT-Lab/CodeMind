def main():
    A, B, C, D, E, F = map(int, input().split())
    ans1 = 0
    ans2 = 0
    for a in range(int(F / (A * 100)) + 1):
        for b in range(int(F / (B * 100)) + 1):
            for c in range(int(F / C) + 1):
                for d in range(int(F / D) + 1):
                    if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (a * A * 100 + b * B * 100) <= E / 100:
                        if a == 0 and b == 0:
                            continue
                        if ans2 / ans1 < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                            ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                            ans2 = C * c + D * d
    print(int(ans1), int(ans2))

if __name__ == "__main__":
    main()