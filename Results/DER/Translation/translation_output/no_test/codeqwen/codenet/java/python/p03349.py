Here is the Python version of the provided Java code:

```python
import sys

class ESequenceGrowingHard:
    def __init__(self):
        self.MOD = 10**9 + 7
        self.k = 0
        self.n = 0
        self.number_of_sequences_of_size_i_with_element_bigger_then_j = [[0]*301 for _ in range(301)]
        self.sum_value = [[0]*301 for _ in range(301)]
        self.n_ch_k = [[0]*301 for _ in range(301)]

    def solve(self, test_number, inp, out):
        self.n = inp.NextInt()
        self.k = inp.NextInt()
        self.n_ch_k = MathExtentions.preComputeNChooseK_MOD_Mod(self.n, self.MOD)
        for j in range(self.k, -1, -1):
            self.number_of_sequences_of_size_i_with_element_bigger_then_j[0][j] = 1 % self.MOD
            self.number_of_sequences_of_size_i_with_element_bigger_then_j[1][j] = (self.k - j) % self.MOD
        self.sum_value[0][self.k] = 1
        self.sum_value[1][self.k] = 0
        for j in range(self.k - 1, -1, -1):
            self.sum_value[0][j] = (self.sum_value[0][j + 1] + self.number_of_sequences_of_size_i_with_element_bigger_then_j[0][j]) % self.MOD
            self.sum_value[1][j] = (self.sum_value[1][j + 1] + self.number_of_sequences_of_size_i_with_element_bigger_then_j[1][j]) % self.MOD
        for i in range(2, self.n + 1
