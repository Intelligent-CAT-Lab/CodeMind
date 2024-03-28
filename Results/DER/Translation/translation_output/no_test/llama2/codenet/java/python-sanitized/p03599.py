import java.util

class p03599:
    def __init__(self):
        pass

    def main(self):
        A = int(input())
        B = int(input())
        C = int(input())
        D = int(input())
        E = int(input())
        F = int(input())
        ans1 = A * 100
        ans2 = 0
        for a in range(0, F / (A * 100)):
            for b in range(0, F / (B * 100)):
                for c in range(0, F / C):
                    for d in range(0, F / D):
                        if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (a * A * 100 + b * B * 100) <= E / 100:
                            if a == 0 and b == 0:
                                continue
                            if ans2 / ans1 < C * c + D * d / (100 * a * A + 100 * b * B + C * c + D * d):
                                ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                                ans2 = C * c + D * d
        print(ans1, ans2)

p03599().main()