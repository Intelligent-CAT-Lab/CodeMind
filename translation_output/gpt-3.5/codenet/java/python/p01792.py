```python
import sys

class Casino:
    def __init__(self):
        self.debug = False

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

    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.print_bet(m)
        elif p == 50:
            print(float(m) / n)
            self.print_bet(min(m, n - m))
        elif p == 100:
            print(1.0)
            self.print_bet(m)
        elif p > 50:
            print(self.get_prob_large(p / 100.0, m, n))
            print("1")
            print("1")
        else:
            self.print_prob_small(p / 100.0, m, n)

    def print_prob_small(self, p, m, n):
        hi = self.get_prob_small(p, m, 1.0)
        print(hi)

        bet = [0] * 100
        self.set_first_bet(bet, 0, m, 0, n)

        bet.sort()
        unique_bets = list(set(bet))
        unique_bets.sort()
        print(len(unique_bets))
        print(unique_bets[0], end="")
        for bet_value in unique_bets[1:]:
            print(" " + str(bet_value), end="")
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

    def get_prob_small(self, p, m, ps):
        if m >= n:
            return 1.0
        if m <= 0:
            return 0.0
        if ps < 0.1**15:
            return 0.0

        x = 0.0
        if 2 * m <= n:
            x = p * self.get_prob_small(p, 2 * m, ps * p)
        else:
            x = p + (1.0 - p) * self.get_prob_small(p, 2 * m - n, ps * (1.0 - p))
        
        return x

    def get_prob_large(self, p, m, n):
        if m > 1000:
            return 1.0
        if n > 1000:
            n = 1000
        f = [0.0] * n
        f[0] = 0.0
        pf = 1 - p
        for i in range(1, n):
            f[i] = p / (1 - pf * f[i - 1])

        result = 1.0
        for i in range(m, n):
            result *= f[i]

        return result

if __name__ == "__main__":
    casino = Casino()
    while True:
        try:
            p, m, n = map(int, input().split())
            casino.print_prob(p, m, n)
        except EOFError:
            sys.exit(0)
```
```
