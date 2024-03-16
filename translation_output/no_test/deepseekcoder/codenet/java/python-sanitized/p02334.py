import sys

class Combinatrics:
    mod = 1000000007
    fact = None
    inv = None
    finv = None

    def __init__(self, n):
        self.fact = [0]*(n+1)
        self.inv = [0]*(n