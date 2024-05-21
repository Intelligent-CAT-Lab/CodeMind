import sys

debug = False

def main():
    for line in sys.stdin:
        p, m, n = map(int, line.split())
        casino = Casino(debug)
        casino.printProb(p, m, n)

class Casino:
    def __init__(self, debug):
        self.debug = debug

    def printProb(self, p, m, n):
        if p == 0:
            print(0)
            self.printBet(m)
        elif p == 50:
            if self.debug:
                print("debug")
                print(self.getProbLarge(p / 100, m, n))
            print((n / 2) / n)
            self.printBet(min(m, n - m))
        elif p == 100:
            print(1)
            self.printBet(m)
        elif p > 50:
            print(self.getProbLarge(p / 100, m, n))
            print("1")
            print("1")
        else:
            self.printProbSmall(p / 100, m, n)

    def printBet(self, m):
        print(m)
        print("1")
        if m <= 200:
            for i in range(2, m + 1):
                print(i, end=" ")
        else:
            for i in range(2, 101):
                print(i, end=" ")
            for i in range(m - 100 + 1, m + 1):
                print(i, end=" ")
        print()

    def printProbSmall(self, p, m, n):
        pb = Prob(p, n)
        hi = pb.getProbSmall(m, 1)
        print(hi)
        if self.debug:
            # if we check all bet pattern, it can not end for larger m value
            # within CPU time limits.
            # This statement is only for check the result.
            bet = []
            cnt = 0
            for i in range(1, m + 1):
                if abs(p * pb.getProbSmall(m + i, 1) + (1 - p) * pb.getProbSmall(m - i, 1) - hi) < 0.000000001:
                    bet.append(i)
                    cnt += 1
            print("debug")
            print(cnt)
            print(bet[0], end=" ")
            for i in range(1, cnt):
                print(bet[i], end=" ")
            print()

    def setFirstBet(self, bet, cnt, m, min, max):
        bet[cnt] = min(m - min, max - m)
        if max > min and (max + min) % 2 == 0:
            if (max + min) // 2 > m:
                max = (max + min) // 2
            else:
                min = (max + min) // 2
            self.setFirstBet(bet, cnt + 1, m, min, max)

    def getProbLarge(self, p, m, n):
        if m > 1000:
            return 1
        if n > 1000:
            n = 1000
        f = [0] * n
        pf = 1 - p
        for i in range(1, n):
            f[i] = p / (1 - pf * f[i - 1])
        if self.debug:
            for i in range(1, n - 1):
                if f[i - 1]!= f[i]:
                    print("f({}) = {}".format(i, f[i]))
        result = 1
        for i in range(m, n):
            result *= f[i]
        return result

class Prob:
    def __init__(self, p, n):
        self.p = p
        self.n = n

    def getProbSmall(self, m, ps):
        if m >= self.n:
            return 1
        if m <= 0:
            return 0
        if ps < 0.000000001:
            return 0
        x = 1
        if 2 * m <= self.n:
            x = self.p * self.getProbSmall(2 * m, ps * self.p)
        else:
            x = self.p + (1 - self.p) * self.getProbSmall(2 * m - self.n, ps * (1 - self.p))
        return x

if __name__ == "__main__":
    main()