```python
class Casino:
    def __init__(self, debug):
        self.debug = debug

    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.print_bet(m)
        elif p == 50:
            if self.debug:
                print("debug")
            print(float(m) / n)
            self.print_bet(min(m, n - m))
        elif p == 100:
            print(1.0)
            self.print_bet(m)
        elif p > 50:
            print(self.get_prob_large(p / 100, m, n))
            print(1)
            print(1)
        else:
            self.print_prob_small(p / 100, m, n)

    def print_bet(self, m):
        print(m)
        print("1", end="")
        if m <= 200:
            for i in range(2, m + 1):
                print(" " + str(i), end="")
        else:
            for i in range(2, 101):
                print(" " + str(i), end="")
            for i in range(m - 100 + 1, m + 1):
                print(" " + str(i), end="")
        print()

    def print_prob_small(self, p, m, n):
        prob = self.Prob(p, n)
        hi = prob.get_prob_small(m, 1.0)
        print(hi)

        if self.debug:
            bet = []
            for i in range(1, m + 1):
                if abs(p * prob.get_prob_small(m + i, 1.0) + (1 - p) * prob.get_prob_small(m - i, 1.0) - hi) < 0.1**10:
                    bet.append(i)
            print("debug")
            print(len(bet))
            print(bet[0], end="")
            for i in range(1, len(bet)):
                print(" " + str(bet[i]), end="")
            print()

        bet = [0] * 100
        self.set_first_bet(bet, 0, m, 0, n)

        bet.sort()
        unique_bets = list(set(bet))
        cnt = len(unique_bets)
        print(cnt)
        print(unique_bets[0], end="")
        for i in range(1, cnt):
            print(" " + str(unique_bets[i]), end="")
        print()

    def set_first_bet(self, bet, cnt, m, min_val, max_val):
        bet[cnt] = min(m - min_val, max_val - m)
        cnt += 1

        if max_val > min_val and (max_val + min_val) % 2 == 0:
            if (max_val + min_val) // 2 > m:
                max_val = (max_val + min_val) // 2
            else:
                min_val = (max_val + min_val) // 2
            self.set_first_bet(bet, cnt, m, min_val, max_val)

    class Prob:
        def __init__(self, p, n):
            self.p = p
            self.n = n

        def get_prob_small(self, m, ps):
            if m >= self.n:
                return 1.0
            if m <= 0:
                return 0.0
            if ps < 0.1**15:
                return 0.0

            x = 1.0
            if 2 * m <= self.n:
                x = self.p * self.get_prob_small(2 * m, ps * self.p)
            else:
                x = self.p + (1 - self.p) * self.get_prob_small(2 * m - self.n, ps * (1 - self.p))

            return x

    def get_prob_large(self, p, m, n):
        if m > 1000:
            return 1.0
        if n > 1000:
            n = 1000
        f = [0] * n
        f[0] = 0
        p_inverse = 1 - p
        for i in range(1, n):
            f[i] = p / (1 - p_inverse * f[i - 1])

        if self.debug:
            for i in range(1, n):
                if f[i - 1] != f[i]:
                    print("f(" + str(i) + ") = " + str(f[i]))

        result = 1.0
        for i in range(m, n):
            result *= f[i]

        return result

def main():
    debug = False
    while debug:
        p, m, n = map(int, input().split())
        casino = Casino(debug)
        casino.print_prob(p, m, n)

if __name__ == "__main__":
    main()
```
```python```
