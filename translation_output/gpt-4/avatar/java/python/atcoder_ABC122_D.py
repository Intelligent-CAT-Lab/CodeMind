Here's the equivalent Python code for the Java code provided above:

```python
class AtCoder_ABC122_D:
    def __init__(self):
        self.N = int(input())
        self.MOD = 1000000007
        self.TOKENS = ["A", "C", "G", "T"]
        self.memo = [{} for _ in range(self.N + 1)]

    def calc(self):
        return self.dfs(0, "TTT")

    def is_ok(self, last4):
        if "AGC" in last4:
            return False
        for i in range(3):
            vals = list(last4)
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
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
            if self.is_ok(last3 + c):
                next_last3 = last3[1:] + c
                result = (result + self.dfs(current + 1, next_last3)) % self.MOD
        self.memo[current][last3] = result
        return result


if __name__ == "__main__":
    instance = AtCoder_ABC122_D()
    print(instance.calc())
```

This Python code preserves the structure and logic of the original Java code. It defines the `AtCoder_ABC122_D` class with an `__init__` method to initialize the problem's parameters and implement the memoization, `calc` method to start the depth-first search, `is_ok` method to check for the "AGC" pattern within substrings, and `dfs` method to progress with the search recursively while memoizing results to avoid redundant calculations. The program is then started with a check for the `__main__` module, creating an instance of the class, and printing the result of the calculation.
