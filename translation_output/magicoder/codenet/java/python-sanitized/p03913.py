import math

class p03913:
    def __init__(self):
        self.n = int(input())
        self.a = int(input())
        self.ans = self.n

    def run(self):
        self.solver()

    def solver(self):
        for m in range(2, 41):
            c = int(self.n ** (