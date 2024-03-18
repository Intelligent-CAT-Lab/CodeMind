Here's the Java code translated into Python:

```python
class Solver:
    def __init__(self, k, n):
        self.k = k
        self.n = n

    def solve_k1(self):
        return [1] * ((self.n + 1) // 2)

    def solve_k_even(self):
        return [self.k // 2] + [self.k] * (self.n - 1)

    def decrement(self, digits):
        for i in range(self.n - 1, -1, -1):
            if digits[i] > 1:
                digits[i] -= 1
                for j in range(i + 1, self.n):
                    digits[j] = self.k
                return
            elif digits[i] == 1:
                digits[i] -= 1
                return

    def solve_k_odd(self):
        digits = [(self.k + 1) // 2] * self.n
        for _ in range(self.n // 2):
            self.decrement(digits)
        return [digit for digit in digits if digit > 0]

    def solve(self):
        if self.k == 1:
            return self.solve_k1()
        elif self.k % 2 == 0:
            return self.solve_k_even()
        else:
            return self.solve_k_odd()


class ContestReader:
    def __init__(self, input_data):
        self.input_data = input_data
        self.tokenizer = iter(input_data.split())

    def next_int(self):
        return int(next(self.tokenizer))


def execute(reader):
    k = reader.next_int()
    n = reader.next_int()
    return ' '.join(map(str, Solver(k, n).solve()))


# Sample Test Case
input_data = "3 2"
reader = ContestReader(input_data)
print(execute(reader))
```

In the provided Python code, I've kept the structure of the Java classes and translated their methods into Python functions, keeping the same names for clarity. The `ContestReader` class is adapted to work with a string input since Python doesn't typically read input in the same way as Java does.

Remember that input/output handling might be different in actual use, so you will need to adapt it to your specific needs, such as reading from stdin or handling file I/O.
