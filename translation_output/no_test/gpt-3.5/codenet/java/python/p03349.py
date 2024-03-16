```python
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
        numberOfSequencesOfSizeIwithElementBiggerThenJ = [[0 for _ in range(301)] for _ in range(301)]
        sumValue = [[0 for _ in range(301)] for _ in range(301)]
        nChK = MathExtensions.preComputeNChooseK_MOD_Mod(n, MOD)
        
        for j in range(k, -1, -1):
            numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % MOD
            numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (k - j) % MOD
        
        sumValue[0][k] = 1
        sumValue[1][k] = 0

        for j in range(k - 1, -1, -1):
            sumValue[0][j] = (sumValue[0][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % MOD
            sumValue[1][j] = (sumValue[1][j + 1] + numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % MOD

        for i in range(2, n + 1):
            for j in range(k - 1, -1, -1):
                res = 0
                for sizeToTheLeft in range(i):
                    optionLeft = sumValue[sizeToTheLeft][j + 1]
                    optionRight = numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j]
                    optionToAddToEachSide = nChK[i - 1][sizeToTheLeft]
                    res = (res + ((((optionLeft * optionRight) % MOD) * optionToAddToEachSide) % MOD)) % MOD
                numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res
                sumValue[i][j] = (sumValue[i][j + 1] + res) % MOD
        return numberOfSequencesOfSizeIwithElementBiggerThenJ[n][0]

inputStream = StringIO("""8 4 1000000007""")
sys.stdin = inputStream

inReader = InputReader(sys.stdin.read())
n = inReader.nextInt()
k = inReader.nextInt()
MOD = inReader.nextLong()

solver = SequenceGrowingHard()
result = solver.solve(n, k, MOD)
print(result)
```
