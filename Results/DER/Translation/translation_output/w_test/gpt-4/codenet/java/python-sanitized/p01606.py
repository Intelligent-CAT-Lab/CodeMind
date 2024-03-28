from math import sqrt

class p01606:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.flag = []
        self.count = []
        self.sum = 0
        self.left = 0
        self.right = 0

    def run(self):
        n, w = map(int, input().split())
        self.solve(n, w)

    def solve(self, n, w):
        self.flag = [False] * (n + 1)
        self.count = [0] * (n + 1)
        self.sum = 0
        self.left = 1
        self.right = w + 1
        for i in range(1, w):
            for k in range(1, int(sqrt(i)) + 1):
                if i % k == 0:
                    self.count[k] += 1
                    self.update(k)
                    if i // k != k:
                        self.count[i // k] += 1
                        self.update(i // k)

        for i in range(n - w + 1):
            self.left = i + 1
            self.right = i + w + 1
            for k in range(1, int(sqrt(i)) + 1):
                if i % k == 0:
                    self.count[k] -= 1
                    self.update(k)
                    if i // k != k:
                        self.count[i // k] -= 1
                        self.update(i // k)
            for k in range(1, int(sqrt(i + w)) + 1):
                if (i + w) % k == 0:
                    self.count[k] += 1
                    self.update(k)
                    if (i + w) // k != k:
                        self.count[(i + w) // k] += 1
                        self.update((i + w) // k)
            self.update(self.left - 1)
            self.update(self.right - 1)

            print(self.sum, end=(' ' if i < n - w else '\n'))

    def update(self, i):
        det = self.left <= i < self.right
        if self.flag[i] and not det and self.count[i] < 2:
            self.flag[i] = False
            self.sum -= 1
        if not self.flag[i] and (det or self.count[i] >= 2):
            self.flag[i] = True
            self.sum += 1

    def debug(self, *args):
        print("DEBUG:", *args)

if __name__ == "__main__":
    p01606().run()