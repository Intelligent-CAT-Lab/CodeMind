Below is the Java code translated into Python. The original Java code includes custom input handling, while in Python a common approach is to use built-in functions like `input()` or `sys.stdin.readline()`. I have converted custom `UserScanner` class to using `input()` for simplicity. Moreover, since Python does not have static typing, many type declarations can be omitted. Additionally, I've translated methods and classes with Pythonic style in mind, such as using underscores in method names and removing getter/setter approaches unless necessary:

```python
import math
import sys

debug = False

def main():
    global debug
    while True:
        inp = input().split()
        p = int(inp[0])
        m = int(inp[1])
        n = int(inp[2])
        casino = Casino(debug)
        casino.print_prob(p, m, n)
        if not debug:
            break

class Casino:
    def __init__(self, debug):
        self.debug = debug

    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.__print_bet(m)
        elif p == 50:
            if self.debug:
                print("debug\n" + str(self.__get_prob_large(p / 100.0, m, n)))
            print(float(m) / n)
            self.__print_bet(min(m, n-m))
        elif p == 100:
            print(1.0)
            self.__print_bet(m)
        elif p > 50:
            print(self.__get_prob_large(p / 100.0, m, n))
            print("1")
            print("1")
        else:
            self.__print_prob_small(p / 100.0, m, n)

    def __print_bet(self, m):
        print(m)
        bets = list(range(1, m+1)) if m <= 200 else list(range(1, 101)) + list(range(m-100+1, m+1))
        print(" ".join(map(str, bets)))

    def __print_prob_small(self, p, m, n):
        pb = self.Prob(p, n)
        hi = pb.get_prob_small(m, 1.0)
        print(hi)
        if self.debug:
            cnt = 0
            bet = []
            for i in range(1, m+1):
                if abs(p * pb.get_prob_small(m + i, 1.0) + (1.0 - p) * pb.get_prob_small(m - i, 1.0) - hi) < math.pow(0.1, 10):
                    bet.append(i)
                    cnt += 1
            print("debug\n" + str(cnt))
            print(" ".join(map(str, bet)))

        bet = [0] * 100
        cnt = self.__set_first_bet(bet, 0, m, 0, n)

        bet = sorted(set(bet))
        cnt = len(bet)
        print(cnt)
        print(" ".join(map(str, bet)))

    def __set_first_bet(self, bet, cnt, m, min_bet, max_bet):
        bet[cnt] = min(m - min_bet, max_bet - m)
        cnt += 1
        if max_bet > min_bet and (max_bet + min_bet) % 2 == 0:
            if (max_bet + min_bet) // 2 > m:
                max_bet = (max_bet + min_bet) // 2
            else:
                min_bet = (max_bet + min_bet) // 2
            return self.__set_first_bet(bet, cnt, m, min_bet, max_bet)
        return cnt

    class Prob:
        def __init__(self, p, n):
            self.p = p
            self.n = n

        def get_prob_small(self, m, ps):
            if m >= self.n:
                return 1.0
            if m <= 0:
                return 0.0
            if ps < math.pow(0.1, 15):
                return 0.0

            if 2 * m <= self.n:
                return self.p * self.get_prob_small(2 * m, ps * self.p)
            else:
                return self.p + (1.0 - self.p) * self.get_prob_small(2 * m - self.n, ps * (1.0 - self.p))

    def __get_prob_large(self, p, m, n):
        if m > 1000:
            return 1.0
        if n > 1000:
            n = 1000

        f = [0.0] * n
        f[0] = 0
        for i in range(1, n):
            f[i] = p / (1.0 - (1.0 - p) * f[i - 1])

        if self.debug:
            for i in range(1, n):
                if f[i - 1] != f[i]:
                    print("f({}) = {}".format(i, f[i]))

        result = 1.0
        for i in range(m, n):
            result *= f[i]

        return result

if __name__ == '__main__':
    main()
```

Since Python has built-in data types and functions that simplify many operations, some classes from the Java example like `UserScanner` are not included or translated into Python, as they are not necessary in a typical Python program. The `UserScanner` functionality, for instance, has been replaced with the Python `input()` method. Also, many of the detailed Java type declarations are not translated because Python has dynamic typing. This translation focuses on preserving the logical flow of the original Java code.
