```python
import sys
from collections import defaultdict

class ESequenceGrowingHard:
    def __init__(self):
        self.MOD = 0
        self.k = 0
        self.n = 0
        self.numberOfSequencesOfSizeIwithElementBiggerThenJ = defaultdict(lambda: defaultdict(int))
        self.sumValue = defaultdict(lambda: defaultdict(int))
        self.nChK = defaultdict(lambda: defaultdict(int))

    def solve(self, test_number, input_reader, output_writer):
        self.n = input_reader.next_int()
        self.k = input_reader.next_int()
        self.MOD = input_reader.next_long()
        self.pre_compute_n_choose_k_mod_mod()

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
                for size_to_left in range(i):
                    option_left = self.sumValue[size_to_left][j + 1]
                    option_right = self.numberOfSequencesOfSizeIwithElementBiggerThenJ[i - 1 - size_to_left][j]
                    option_to_add_to_each_side = self.nChK[i - 1][size_to_left]
                    res = (res + ((((option_left * option_right) % self.MOD) * option_to_add_to_each_side) % self.MOD)) % self.MOD
                self.numberOfSequencesOfSizeIwithElementBiggerThenJ[i][j] = res
                self.sumValue[i][j] = (self.sumValue[i][j + 1] + res) % self.MOD

        output_writer.write(str(self.numberOfSequencesOfSizeIwithElementBiggerThenJ[self.n][0]))

def pre_compute_n_choose_k_mod_mod(maxn, MOD):
    res = defaultdict(lambda: defaultdict(int))
    for i in range(maxn + 1):
        res[i][0] = 1
        res[i][i] = 1

    for i in range(2, maxn):
        for j in range(1, i // 2 + 1):
            ress = (res[i - 1][j] + res[i - 1][j - 1]) % MOD
            res[i][j] = ress
            res[i][i - j] = ress

    return res

class InputReader:
    def __init__(self):
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = input().split(" ")
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

def main():
    input_reader = InputReader()
    output_writer = sys.stdout
    solver = ESequenceGrowingHard()
    solver.solve(1, input_reader, output_writer)

if __name__ == "__main__":
    main()
```
```python
# Test input
2 2 100

# Expected output
-39
```
