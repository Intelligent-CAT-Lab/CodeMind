import sys

class EStopOtherwise:
    def __init__(self):
        self.k = 0
        self.n = 0
        self.ans = []

    def solve(self, testNumber, inputReader, outputWriter):
        self.k = inputReader.readInt()
        self.n = inputReader.readInt()

        Modulo.mod = 998244353
        Modulo.buildCombination(5000)

        for i in range