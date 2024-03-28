class p00404:

    def search(self, x, y):
        x_min = 0
        y_min = 0
        x_max = 0
        y_max = 0
        f, f1, f2 = 1, 0, 0
        p = 0
        while True:
            if x_min <= x <= x_max and y_min <= y <= y_max:
                return (p % 3) + 1
            f = f1 + f2
            if p % 4 == 0:  # east
                x_max += f
            elif p % 4 == 1:  # north
                y_max += f
            elif p % 4 == 2:  # west
                x_min -= f
            else:  # south
                y_min -= f
            f2 = f1
            f1 = f
            p += 1

    def solve(self):
        x, y = map(int, input().split())
        print(self.search(x, y))


if __name__ == "__main__":
    p00404().solve()