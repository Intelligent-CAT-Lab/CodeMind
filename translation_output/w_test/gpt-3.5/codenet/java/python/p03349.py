```python
import sys
from collections import defaultdict

class ESequenceGrowingHard:
    def __init__(self):
        self.MOD = 10**9 + 7
        self.k = 0
        self.n = 0
        self.numberOfSequencesOfSizeIwithElementBiggerThenJ = defaultdict(lambda: defaultdict(int))
        self.sumValue = defaultdict(lambda: defaultdict(int))
        self.nChK = defaultdict(lambda: defaultdict(int))

    def solve(self, testNumber):
        self.n, self.k, self.MOD = map(int, input().split())
        self.preComputeNChooseK_MOD_Mod(self.n)
        
        for j in range(self.k, -1, -1):
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j] = 1 % self.MOD
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j] = (self.k - j) % self.MOD

        self.sumValue[0][self.k] = 1
        self.sumValue[1][self.k] = 0
        
        for j in range(self.k - 1, -1, -1):
            self.sumValue[0][j] = (self.sumValue[0][j + 1] + self.numberOfSequencesOfSizeIwithElementBiggerThenJ[0][j]) % self.MOD
            self.sumValue[1][j] = (self.sumValue[1][j + 1] + self.numberOfSequencesOfSizeIwithElementBiggerThenJ[1][j]) % self.MOD

        for i in range(2, self.n + 1):
            for j in range(self.k - 1, -1, -1):
                res = 0
                for sizeToTheLeft in range(i):
                    optionLeft = self.sumValue[sizeToTheLeft][j + 1]
                    optionRight = self.numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - sizeToTheLeft][j]
                    optionToAddToEachSide = self.nChK[i - 1][sizeToTheLeft]
                    res = (res + ((((optionLeft * optionRight) % self.MOD) * optionToAddToEachSide) % self.MOD)) % self.MOD
                self.numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res
                self.sumValue[i][j] = (self.sumValue[i][j + 1] + res) % self.MOD

        print(self.numberOfSequencesOfSizeIwithElementBiggerThenJ[self.n][0])

    def preComputeNChooseK_MOD_Mod(self, maxn):
        for i in range(maxn + 1):
            self.nChK[i][0] = 1
            self.nChK[i][i] = 1
        for i in range(2, maxn):
            for j in range(1, i // 2 + 1):
                ress = (self.nChK[i - 1][j] + self.nChK[i - 1][j - 1]) % self.MOD
                self.nChK[i][j] = ress
                self.nChK[i][i - j] = ress

def main():
    solver = ESequenceGrowingHard()
    solver.solve(1)

if __name__ == "__main__":
    main()
```
This Python translation of the Java code will read the input in the desired format and output the expected result for the provided test case.
