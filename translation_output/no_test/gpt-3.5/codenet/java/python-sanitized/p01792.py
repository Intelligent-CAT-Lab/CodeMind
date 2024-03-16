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
            print(