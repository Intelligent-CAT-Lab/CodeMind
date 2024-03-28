import math

class p02677:
    def __init__(self):
        self.solve()

    def solve(self):
        A, B, H, M = map(int, input().split())
        a_x = float(A) * math.sin(math.pi * 2 * (H * 60 + M) / 720)
        b_x = float(B) * math.sin(math.pi * 2 * M / 60)
        a_y = float(A) * math.cos(math.pi * 2 * (H * 60 + M) / 720)
        b_y = float(B) * math.cos(math.pi * 2 * M / 60)
        print(math.sqrt((a_x - b_x) ** 2 + (a_y - b_y) ** 2))


if __name__ == "__main__":
    main = p02677()