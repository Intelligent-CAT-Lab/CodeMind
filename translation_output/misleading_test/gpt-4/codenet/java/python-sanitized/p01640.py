import sys
from collections import defaultdict

class Solver:
    def __init__(self):
        self.w, self.h, gx, gy, n = map(int, input().split())
        self.gx, self.gy = gx - 1, gy - 1
        self.points = []
        for i in range(n):
            x, y = map(int, input().split())
            self.points.append((x - 1, y - 1))
        self.run = input() + "$"

    def solve(self):
        total_sum = 0
        for d in range(4):
            total_sum += self.calculate_sum()
            ngx, ngy = self.h - 1 - self.gy, self.gx
            self.gx, self.gy = ngx, ngy
            new_points = []
            for x, y in self.points:
                nx, ny = self.h - 1 - y, x
                new_points.append((nx, ny))
            self.points = new_points
            self.w, self.h = self.h, self.w
        print(total_sum)

    def calculate_sum(self):
        sets1 = defaultdict(lambda: {self.h})
        sets2 = defaultdict(lambda: {self.w})
        # Initialize the TreeSets
        for x, y in self.points:
            sets1[x].add(y)
            sets2[y].add(x)
        sets1[self.gx].add(self.gy)
        sets2[self.gy].add(self.gx)

        current_sum = 1
        for x in range(self.w):
            sorted_ys = sorted(sets1[x])
            py = -2
            for y in sorted_ys:
                sy = y - 1
                if sy != py:
                    if self.is_valid(x, sy, 0):
                        current_sum += y - py - 1
                py = y
        return current_sum

    def is_valid(self, x, y, d):
        for k in range(len(self.run)):
            if d == 0:
                wx, wy = x, min(y_ele for y_ele in sets1[x] if y_ele > y)
                ny = wy - 1
                nx = x
            elif d == 1:
                wy, wx = y, max(x_ele for x_ele in sets2[y] if x_ele < x)
                ny = y
                nx = wx + 1
            elif d == 2:
                wx, wy = x, max(y_ele for y_ele in sets1[x] if y_ele < y)
                ny = wy + 1
                nx = x
            else:  # d == 3
                wy, wx = y, min(x_ele for x_ele in sets2[y] if x_ele > x)
                ny = y
                nx = wx - 1

            if wx == self.gx and wy == self.gy:
                return True

            x, y = nx, ny
            c = self.run[k]
            if c == 'L':
                d = (d + 3) % 4
            elif c == 'R':
                d = (d + 1) % 4

        return False

def main():
    Solver().solve()

if __name__ == "__main__":
    main()