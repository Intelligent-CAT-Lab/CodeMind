class FastReader:
    def __init__(self):
        self.br = open(0)

    def next(self):
        return self.br.readline().rstrip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

class Solution:
    def solve(self):
        sc = FastReader()

        L = sc.next_int()
        R = sc.next_int()

        R -= L
        L %= 2019
        R += L

        res = 2019  # max value

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