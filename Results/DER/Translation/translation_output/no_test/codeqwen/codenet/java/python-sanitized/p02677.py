import math

class p02677:
    def solve(self):
        A = int(input())
        B = int(input())
        H = int(input())
        M = int(input())
        a_x = 1.0 * A * math.sin(math.pi * 2 * (H * 60 + M) / 720)
        b_x = 1.0 * B * math.sin(math.pi * 2 * M / 60)
        a_y = 1.0 * A * math.cos(math.pi * 2 * (H * 60 + M) / 720)
        b_y = 1.0 * B * math.cos(math.pi * 2 * M / 60)
        print(math.sqrt((a_x - b_x) * (a_x - b_x) + (a_y - b_y) * (a_y - b_y)))

p02677().solve()