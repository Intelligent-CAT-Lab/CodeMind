import sys

def main():
    input_list = sys.stdin.readline().strip().split()
    A, B, C, D, E, F = map(float, input_list)
    ans1 = A * 100
    ans2 = 0
    for a in range(int(F / ans1) + 1):
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

if __name__ == '__main__':
    main()