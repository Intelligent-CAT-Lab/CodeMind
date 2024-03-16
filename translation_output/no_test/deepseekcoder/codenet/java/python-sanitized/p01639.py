import sys

# MLE
class p01639:
    def __init__(self):
        self.sc = sys.stdin

    def run(self):
        self.n = int(self.sc.readline())
        self.k = int(self.sc.readline()) - 1
        self.x0 = int(self.sc.readline())
        self.solve()

    def solve(self):
        if self.x0 == 0:
            self.println("0")
            return

        x = self.x0
        s = 10000
        count = [0]*s
        M = 10**12
        offset = 2**63
        for i in range(self.n):
            at = int((x + offset) * M) % s
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
        is_ = [0]*length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M) % s
            if at == target:
                is_[now] = x
                now += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        is_.sort()
        self.println(str(is_[self.k - sum]))

    def println(self, s):
        print(s)


if __name__ == "__main__":
    p01639().run()