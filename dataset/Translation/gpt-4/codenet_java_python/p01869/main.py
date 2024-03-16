import sys

class p01869:
    def __init__(self):
        self.__t__ = 1
        self.__f__ = 0
        self.__FILE_DEBUG_FLAG__ = self.__f__
        self.__DEBUG_FILE_NAME__ = "src/D1"
        self.hash = {}

    def is_all_8(self, d):
        while d > 0:
            if d % 10 != 8:
                return False
            d //= 10
        return True

    def func(self, n):
        if n in self.hash:
            return self.hash[n]

        same = False
        now = n
        res = -1
        max_len = len(str(n))
        for dlen in range(max_len, 0, -1):
            for i in range(1 << dlen):
                d = 0
                ten = 1
                for j in range(dlen):
                    if (i & (1 << j)) == 0:
                        d += ten * 8
                    else:
                        d += ten * 2
                    ten *= 10
                if n == d:
                    same = True
                    continue
                if now < d:
                    continue
                if now % d == 0:
                    res = max(res, self.func(now // d) + self.func(d))

        if same:
            res = max(res, 1)
        elif res == -1:
            res = -100000000

        self.hash[n] = res
        return res

    def solve(self):
        n = int(input())
        if n == 1:
            print(-1)
            return

        res = self.func(n)
        print(-1 if res <= -1 else res)

    def run(self):
        if self.__FILE_DEBUG_FLAG__ == self.__t__:
            try:
                sys.stdin = open(self.__DEBUG_FILE_NAME__, 'r')
                print("FILE_INPUT!")
            except FileNotFoundError as e:
                print("File not found:", e)
                sys.exit()
        else:
            sys.stdin = sys.__stdin__

        self.solve()

if __name__ == "__main__":
    p01869().run()