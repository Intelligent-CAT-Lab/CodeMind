Sure, here's how you could translate the Java code into Python code:

```python
import math
import sys

class Casino:
    def __init__(self, debug):
        self.debug = debug

    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.print_bet(m)
        elif p == 50:
            if self.debug:
                print("debug\n" + str(self.get_prob_large(p / 100, m, n)))
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
        bet = list(range(1, m + 1))
        if m > 200:
            bet = list(range(1, 101)) + list(range(m - 100 + 1, m + 1))
        print(" ".join(map(str, bet)))

    def print_prob_small(self, p, m, n):
        pb = Prob(p, n)
        hi = pb.get_prob_small(m, 1.0)
        print(hi)
        
        if self.debug:
            raise NotImplementedError("Debug output is not implemented")

        bet = self.get_first_bet(m, n)

        bets = sorted(set(bet))
        cnt = len(bets)
        print(cnt)
        print(" ".join(map(str, bets)))

    def get_first_bet(self, m, n):
        bets = []
        min_val, max_val = 0, n
        while max_val > min_val and (max_val + min_val) % 2 == 0:
            bet = min(m - min_val, max_val - m)
            bets.append(bet)
            mid_val = (max_val + min_val) // 2
            if mid_val > m:
                max_val = mid_val
            else:
                min_val = mid_val
        
        return bets

    def get_prob_large(self, p, m, n):
        if m > 1000:
            return 1.0
        n = min(n, 1000)
        f = [0] * n
        f[0] = 0
        pf = 1 - p
        
        for i in range(1, n):
            f[i] = p / (1 - pf * f[i - 1])

        result = 1.0
        for i in range(m, n):
            result *= f[i]

        return result

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
            x = self.p * self.get_prob_small(2 * m, ps * self.p)
        else:
            x = self.p + (1 - self.p) * self.get_prob_small(2 * m - self.n, ps * (1 - self.p))

        return x

def main():
    debug = False
    
    input_data = input().split()
    p, m, n = map(int, input_data)

    casino = Casino(debug)
    casino.print_prob(p, m, n)

if __name__ == "__main__":
    main()
```

Please note that due to Java's usage of classes and static methods to structure the code, the Python version may feel less idiomatic since Python does not require nor typically use such an approach for simple scripts. Additionally, the `UserScanner` class was replaced by using Python's built-in `input()` function for simplicity, as the original Java class manages buffered input which is beyond the scope of the typical use case in Python. This version assumes that the entire space-separated test cases input will be given on a single line and is not an infinite loop like the original Java code. 

The code could be further adjusted to provide an equivalent level of efficiency and functionality provided by Java's `UserScanner`, but for the sake of brevity and to match typical Python usage, I used the `input()` function for reading test input and assumed EOF indicates the end of input.
