class P00280:
    def __init__(self):
        self.a = 0
        self.b = 0

    def run(self):
        self.a, self.b = [int(x) for x in input().split()]
        self.solve(0, 0, "")

    def solve(self, x, y, s):
        if ((x == 5 and y < self.b and y != 4) or
           (y == 5 and x < self.a and x != 4)):
            return
        if x == self.a + 1 or y == self.b + 1:
            return
        if x == self.a and y == self.b:
            print(s)
        self.solve(x + 1, y, s + "A")
        self.solve(x, y + 1, s + "B")


if __name__ == "__main__":
    p = P00280()
    p.run()