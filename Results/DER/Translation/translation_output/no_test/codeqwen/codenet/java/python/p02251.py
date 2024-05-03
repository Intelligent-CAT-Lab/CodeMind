```python
import sys

class p02251:
    def solve(self):
        n = self.nextInt()
        ans = 0

        # 25 cent
        ans += n // 25
        n %= 25

        # 10 cent
        ans += n // 10
        n %= 10

        # 5 cent
        ans += n // 5
        n %= 5

        # 1 cent
        ans += n

        print(ans)

    # <p02251 Method>
    out = sys.stdout

    @staticmethod
    def main(args):
        p02251().solve()
        p02251.out.flush()

    # <Default Field>
    maxInt = 2**31 - 1
    minInt = -2**31
    mod = 10**9 + 7

    # <Default Method>
    @staticmethod
    def max(*ar):
        return max(ar)

    @staticmethod
    def min(*ar):
        return min(ar)

    @staticmethod
    def calcManhatDistance(x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    @staticmethod
    def calcEuclidDistance(x1, y1, x2, y2):
        return (x2 - x1)**2 + (y2 - y1)**2

    @staticmethod
    def isPrime(n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        d = n**0.5
        for i in range(3, int(d) + 1, 2):
            if n % i == 0:
                return False
        return True

    @staticmethod
    def printChar2DArray(ar):
        for i in range(len(ar)):
            for j in range(len(ar[0])):
                p02251.out.write(ar[i][j])
            p02251.out.write('\n')

    # <Fast Sc
