Here's the translated code into Python:

```python
import re

class p00899:
    def __init__(self):
        self.N = 0
        self.N2 = 0
        self.INF = 1 << 29

    def solve(self, inputs):
        str_ = inputs.copy()

        eq = [False] * self.N
        for i in range(self.N):
            if eq[i]:
                continue
            for j in range(self.N):
                if i != j and not eq[j] and re.search(".*?" + str_[j] + ".*?", str_[i]):
                    eq[j] = True

        str2 = [str_[i] for i in range(self.N) if not eq[i]]
        self.N2 = len(str2)

        len_ = [[self.INF] * self.N2 for _ in range(self.N2)]
        for i in range(self.N2):
            for j in range(self.N2):
                if i == j:
                    continue
                offset, l = 0, len(str2[i])
                while offset < l:
                    if str2[j].startswith(str2[i][offset:]):
                        break
                    offset += 1
                len_[i][j] = len(str2[j]) - (l - offset)

        dp = [[self.INF] * self.N2 for _ in range(1 << self.N2)]
        for i in range(self.N2):
            dp[1 << i][i] = len(str2[i])

        for i in range(1 << self.N2):
            for j in range(self.N2):
                if dp[i][j] >= self.INF:
                    continue
                for k in range(self.N2):
                    if (i & (1 << k)) > 0:
                        continue
                    new_idx = i | (1 << k)
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_[j][k])

        ans = self.INF
        tmp = (1 << self.N2) - 1
        for i in range(self.N2):
            ans = min(ans, dp[tmp][i])
        return ans

def main():
    # Replace the following list with actual input
    inputs = ["3", "atcoder", "redcoder", "recorder"]
    solver = p00899()
    solver.N = int(inputs[0])
    print(solver.solve(inputs[1:]))

# The following lines simulate input/output
if __name__ == "__main__":
    main()
```

And this is how you can use the solution to check the test case provided in the problem:

```python
solver = p00899()
solver.N = 3
print(solver.solve(["atcoder", "redcoder", "recorder"])) # Expected output: 16
```

For this adjusted example, the inputs (assumed to have been retrieved and preprocessed from somewhere) are directly passed to the `solve()` method as a list of strings, since Python typically does not read from standard input in the same way Java does. The `print(solver.solve(...))` line is where you would insert the actual input strings you want to test against the algorithm.
