Here's the Java code translated to Python:

```python
# Importing necessary libraries for IO
import sys
import math

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

# Solver class corresponding to Solver class in Java
class Solver:
    def __init__(self):
        self.sc = FastScanner()
        
    def solve(self):
        x = self.sc.next_int()
        y = self.sc.next_int()
        z = self.sc.next_int()
        result = (x - z) // (y + z)
        print(result)

    def exit(self):
        sys.exit(0)

if __name__ == "__main__":
    solver = Solver()
    solver.solve()
    solver.exit()
```

You can run this code by redirecting a file to the Python script or by typing inputs directly when the script is executed, just like with the Java program.

Here's the test input provided:

```plaintext
13 3 1
```

And the expected output:

```plaintext
3
``` 

The main function initializes a `Solver` object, which uses the `solve` method to compute the result given the inputs, which it reads using the `FastScanner` object. After solving, the script exits gracefully. The output will be the integer part of the division, since in Python, floor division `//` returns an integer directly.
