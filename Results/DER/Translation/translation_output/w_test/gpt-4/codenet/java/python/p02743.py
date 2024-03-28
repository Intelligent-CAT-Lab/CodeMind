Here's the Python version of the given Java code:

```python
import sys

class Solver:
    def __init__(self):
        self.input_data = input().split()
        self.index = 0

    def next_long(self):
        number = int(self.input_data[self.index])
        self.index += 1
        return number

    def run(self):
        a = self.next_long()
        b = self.next_long()
        c = self.next_long()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    solver = Solver()
    solver.run()
```

This Python script reads space-separated values from the standard input (`sys.stdin`), which is typically the console. It defines a `Solver` class that will parse input to obtain long integers and processes the logic to determine if the output should be "Yes" or "No" based on the given criteria.

For the test input provided (2 3 9), placing it at the start of the execution (for example, through the console) and running this script should yield the expected output:

```
No
```
