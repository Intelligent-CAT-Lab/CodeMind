```python
import sys
import math

debug = False

class Casino:
    def __init__(self, debug):
        self.debug = debug
    
    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.print_bet(m)
        elif p == 50:
            if debug:
                print("debug", self.get_prob_large(p / 100.0, m, n))
            print(float(m) / n)
            self.print_bet(min(m, n - m))
        elif p == 100:
            print(1.0)
            self.print_bet(m)
        elif p > 50:
            print(self.get_prob_large(p / 100.0, m, n))
            print(1)
            print(1)
        else:
            self.print_prob_small(p / 100.0, m, n)
    
    def print_bet(self, m):
        bets = list(range(1, m + 1))
        if m > 200:
            bets = list(range(1, 101)) + list(range(m - 99, m + 1))
        print(' '.join(str(bet) for bet in bets))
    
    def print_prob_small(self, p, m, n):
        pb = Prob(p, n)
        hi = pb.get_prob_small(m, 1.0)
        print(hi)
        if debug:
            bet = []
            for i in range(1, m + 1):
                if abs(p * pb.get_prob_small(m + i, 1.0) + (1.0 - p) * pb.get_prob_small(m - i, 1.0) - hi) < math.pow(0.1, 10):
                    bet.append(i)
            print("debug", len(bet))
            print(' '.join(str(b) for b in bet))
        
        bet = [0] * 100
        self.set_first_bet(bet, 0, m, 0, n)
        
        bet = sorted(set(bet))
        bet = [b for b in bet if b > 0]
        print(len(bet))
        print(' '.join(str(b) for b in bet))
    
    def set_first_bet(self, bet, cnt, m, min, max):
        bet[cnt] = min(m - min, max - m)
        cnt += 1
        if max > min and (max + min) % 2 == 0:
            if (max + min) // 2 > m:
                max = (max + min) // 2
            else:
                min = (max + min) // 2
            self.set_first_bet(bet, cnt, m, min, max)

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
        x = 1.0
        if 2 * m <= self.n:
            x = self.p * self.get_prob_small(2 * m, ps * self.p)
        else:
            x = self.p + (1.0 - self.p) * self.get_prob_small(2 * m - self.n, ps * (1.0 - self.p))
        return x
    
def get_prob_large(p, m, n):
    if m > 1000:
        return 1.0
    if n > 1000:
        n = 1000
    f = [0.0] * n
    f[0] = 0.0
    pf = 1 - p
    for i in range(1, n):
        f[i] = p / (1 - pf * f[i - 1])

    if debug:
        for i in range(1, n):
            if f[i - 1] != f[i]:
                print(f"f({i}) = {f[i]}")

    result = 1.0
    for i in range(m, n):
        result *= f[i]
    return result

def main():
    p, m, n = map(int, sys.stdin.readline().split())
    casino = Casino(debug)
    casino.print_prob(p, m, n)

if __name__ == "__main__":
    main()
```
This Python code aims to replicate the structure and logic from the original Java code as closely as possible, taking care to translate concepts like classes, method definitions, and loops into Python-equivalent constructs. When trying to adapt certain parts of the code, direct analogs to Java's objects, such as `UserScanner`, are not necessary in Python because the built-in functions `input()` and `map()` provide similar functionality. In this code, `map(int, sys.stdin.readline().split())` is used to read and parse the input.

This script expects input to come from standard input (`sys.stdin`), which is how the original Java code was structured to read input from `System.in`. When testing the code, you should either supply input through the console or redirect input from a file into the program.
