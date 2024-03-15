import sys
from io import StringIO
import math

class InputReader:
    def __init__(self, s):
        self.tokens = s.strip().split()
        self.pointer = 0
    
    def next(self):
        if self.pointer >= len(self.tokens):
            return None
        self.pointer += 1
        return self.tokens[self.pointer - 1]
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())

class MathExtensions:
    @staticmethod
    def preComputeNChooseK_MOD_Mod(maxn, MOD):
        res = [[0 for _ in range(maxn + 1)] for _ in range(maxn + 1)]
        for i in range(maxn + 1):
            res[i][0] = 1
            res[i][i] = 1
        for i in range(2, maxn):
            for j in range(1, i // 2 + 1):
                ress = (res[i - 1][j] + res[i - 1][j - 1]) % MOD
                res[i][j] = ress
                res[i][i - j] = ress
        return res

class SequenceGrowingHard:
    def solve(self, n, k, MOD):
        numberOfSequencesOfSizeIwithElementBigger