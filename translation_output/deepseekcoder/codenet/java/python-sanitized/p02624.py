import sys

# Template for atcoder
class p02624:

    MOD = 1000 * 1000 * 1000 + 7
    dx = [0, -1, 0, 1]
    dy = [1, 0, -1, 0]

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

    def shuffle(self, a):
        n = len(a)
        for i in range(n):
            r = i + int(n * random.random())
            a[i], a[r] = a[r], a[i]

    def out(self, o):
        sys.stdout.write(str(o))

    def outln(self, o):
        sys.stdout.write(str(o) + '\n')

    def __init__(self):
        self.solve()

    def nextLongArr(self, n):
        return list(map(int, sys.stdin.readline().split()))

    def nextIntArr(self, n):
        return list(map(int, sys.stdin.readline().split()))

    def nextToken(self):
        return sys.stdin.readline().strip()

    def nextString(self):
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.nextToken())

    def nextLong(self):
        return long(self.nextToken())

    def nextDouble(self):
        return float(self.nextToken())

if __name__ == "__main__":
    p02624()