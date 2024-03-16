Here is the Java code translated into Python, with the structure and functionality preserved as closely as possible:

```python
import sys

class Solver:
    def __init__(self, k, n):
        self.k = k
        self.n = n
    
    def solve_k1(self):
        answers = [1 for _ in range((self.n + 1) // 2)]
        return answers
    
    def solve_k_even(self):
        answers = [self.k // 2] + [self.k for _ in range(1, self.n)]
        return answers
    
    def decrement(self, digits):
        i = self.n - 1
        while True:
            if digits[i] > 1:
                digits[i] -= 1
                for j in range(i + 1, self.n):
                    digits[j] = self.k
                return
            elif digits[i] == 1:
                digits[i] -= 1
                return
            i -= 1
    
    def solve_k_odd(self):
        digits = [(self.k + 1) // 2] * self.n
        for i in range(self.n // 2):
            self.decrement(digits)
        answers = [digit for digit in digits if digit > 0]
        return answers
    
    def solve(self):
        if self.k == 1:
            return self.solve_k1()
        elif self.k % 2 == 0:
            return self.solve_k_even()
        else:
            return self.solve_k_odd()

class ContestReader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            line = self.input_stream.readline().rstrip('\n')
            self.tokenizer = line.split()
        return self.tokenizer.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_array(self, n):
        return [self.next() for _ in range(n)]
    
    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

if __name__ == '__main__':
    reader = ContestReader(sys.stdin)
    k = reader.next_int()
    n = reader.next_int()
    solver = Solver(k, n)
    answers = solver.solve()
    for ans in answers:
        print(ans)
```

Some notes on the translation:
- The Java class `Solver` is translated into a Python class with methods adapted to Python coding conventions.
- The `ContestReader` class in Java used for IO is replaced by a class with similar functionality in Python.
- Java's print writer `PrintWriter` is omitted since in Python, you can directly use `print()`.
- The translation does not include `ModCalculator`, `Algorithm`, and `UnionFind` as they are not related to the `Solver` class functionality and aren't used in the `main` method in the given Java code. If needed, equivalent Python implementations for those would have to be provided separately.
