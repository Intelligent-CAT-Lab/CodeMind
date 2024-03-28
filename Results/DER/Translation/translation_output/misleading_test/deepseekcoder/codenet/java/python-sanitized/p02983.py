class FastReader:
    import sys
    import io
    import string
    import re

    def __init__(self, s=None):
        if s is None or len(s) == 0:
            self.s = sys.stdin.read().strip()
        else:
            self.s = s.strip()
        self.s = re.split(r'\s+', self.s)
        self.i = 0

    def next(self):
        while self.i < len(self.s) and self.s[self.i] == '':
            self.i += 1
        res = ''
        while self.i < len(self.s) and self.s[self.i][0] in string.ascii_letters:
            res += self.s[self.i]
            self.i += 1
        return res

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        while self.i < len(self.s) and self.s[self.i] == '':
            self.i += 1
        res = ''
        while self.i < len(self.s) and self.s[self.i][0] not in string.ascii_letters:
            res += self.s[self.i]
            self.i += 1
        return res.strip()


class Solution:
    def solve(self):
        sc = FastReader()
        L = sc.nextInt()
        R = sc.nextInt()

        R -= L
        L %= 2019
        R += L

        res = 2019

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R + 1):
            for j in range(L, i):
                res = min(res, (i * j) % 2019)
        print(res)


if __name__ == "__main__":
    ob = Solution()
    ob.solve()