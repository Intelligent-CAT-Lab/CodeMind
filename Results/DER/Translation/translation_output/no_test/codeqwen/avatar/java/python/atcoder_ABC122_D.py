Here is the Python version of the Java code:

```python
import sys

class atcoder_ABC122_D:
    def __init__(self):
        self.N = int(sys.stdin.readline())
        self.MOD = 1000000007
        self.TOKENS = ["A", "C", "G", "T"]
        self.memo = [{} for _ in range(self.N + 1)]

    def calc(self):
        return self.dfs(0, "TTT")

    def isOK(self, last4):
        if "AGC" in last4:
            return False
        for i in range(3):
            vals = list(last4)
            vals[i] = last4[i + 1]
            vals[i + 1] = last4[i]
            s = "".join(vals)
            if "AGC" in s:
                return False
        return True

    def dfs(self, current, last3):
        if last3 in self.memo[current]:
            return self.memo[current][last3]
        if current == self.N:
            return 1
        result = 0
        for c in self.TOKENS:
            if self.isOK(last3 + c):
                result = (result + self.dfs(current + 1, last3[1:] + c)) % self.MOD
        self.memo[current][last3] = result
        return result

if __name__ == "__main__":
    ins = atcoder_ABC122_D()
    print(ins.calc())
```

This Python code does the same thing as the Java code. It reads the input from the standard input, calculates the result, and prints it out. The main difference is that Python uses different syntax and data structures than Java. For example, Python uses list comprehensions to create a list of dictionaries, and Python uses the `join` method to concatenate strings.
