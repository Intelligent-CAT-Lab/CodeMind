import sys
from math import pow
from array import array

class P01639:
    def __init__(self):
        self.n = 0
        self.k = 0
        self.x0 = 0

    def run(self):
        self.n, self.k, self.x0 = map(int, input().split())
        self.solve()

    def solve(self):
        if self.x0 == 0:
            print("0")
            return

        x = self.x0
        s = int(1e4)
        count = array('i', [0]*s)
        offset = pow(2, 63)
        M = s / pow(2, 64)

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

        sum_val = 0
        length = -1
        target = -1

        for i in range(s):
            if sum_val <= self.k and self.k < sum_val + count[i]:
                target = i
                length = count[i]
                break
            sum_val += count[i]

        now = 0
        is_list = []
        x = self.x0

        for i in range(self.n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            if at == target:
                is_list.append(x)
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        is_list.sort()
        print(str(is_list[self.k - sum_val]))

if __name__ == "__main__":
    p = P01639()
    p.run()