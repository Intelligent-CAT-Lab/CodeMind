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
            print(