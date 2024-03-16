import sys

class p01639:
    def __init__(self):
        self.n, self.k = map(int, sys.stdin.readline().split())
        self.x0 = int(sys.stdin.readline())

    def run(self):
        self.solve()

    def solve(self):
        if self.x0 == 0:
            print("0")
            return

        x = self.x0
        s = 10000
        count = [0] * s
        offset = 2 ** 63
        M = s / (2 ** 64)
        for i in range(self.n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            count[at] += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        sum = 0
        length = -1
        target = -1
        for i in range(s):
            if sum <= self.k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]

        now = 0
        is_ = [0] * length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            if at == target:
                is_[now] = x
                now += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        is_.sort()
        print(is_[self.k - sum])

p01639().run()