class p00404:
    def search(self, x, y):
        x_min, y_min, x_max, y_max = 0, 0, 0, 0
        f, f1, f2 = 1, 1, 0
        p = 0
        while True:
            if x_min <= x <= x_max and y_min <= y <= y_max:
                return p % 3 + 1
            f = f1 + f2
            if p % 4 == 0:
                x_max += f  # east
            elif p % 4 == 1:
                y_max += f  # north
            elif p % 4 == 2:
                x_min -= f  # west
            else:
                y_min -= f  # south
            f2, f1 = f1, f
            p += 1

    def solve(self):
        x = int(input())
        y = int(input())
        print(self.search(x, y))


if __name__ == "__main__":
    p00404().solve()