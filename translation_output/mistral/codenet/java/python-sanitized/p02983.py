import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasmoreelements():
            try:
                self.st = self.br.readline().split()
            except Exception as e:
                e.printStackTrace()
        return self.st.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline()


class Solution:
    def solve(self):
        sc = FastReader()

        L = sc.nextInt()
        R = sc.nextInt()

        R -= L
        L %= 2019
        R += L

        res = 2019  #max value

        if(R - L > 2019):
            print(0)
            return

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)


if __name__ == "__main__":
    Solution().solve()