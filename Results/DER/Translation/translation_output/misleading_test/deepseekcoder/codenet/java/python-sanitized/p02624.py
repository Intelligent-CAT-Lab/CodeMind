import sys

class p02624:

    def __init__(self):
        self.MOD = 1000 * 1000 * 1000 + 7
        self.solve()

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = int(sys.stdin.readline())
        for i in range(1, n + 1):
            res += 1 * i * div[i]
        print(res)

if __name__ == "__main__":
    p02624()