class p03551:

    def __init__(self):
        self.n, self.m = map(int, input().split())

    def run(self):
        base = self.n * 100 + self.m * 1800
        print(base << self.m)


if __name__ == "__main__":
    m = p03551()
    m.run()