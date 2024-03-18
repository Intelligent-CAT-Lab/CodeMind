Here's the translation of the provided Java code into Python:

```python
class Solver:
    def __init__(self):
        self.maxDiff = 1_000_000_000
    
    def solve(self, x):
        powMap = {0: 0, 1: 1}
        
        beforePow = 1
        base = 2
        while True:
            powVal = self.pow(base, 5)
            powMap[powVal] = base
            if powVal - beforePow > x:
                break
            base += 1
            beforePow = powVal
        
        for powVal, base in powMap.items():
            diff = abs(x - powVal)
            if diff in powMap:
                if powVal - x < 0:
                    return f"{base} -{powMap[diff]}"
                else:
                    return f"{base} {powMap[diff]}"
        
        return -1

    def pow(self, base, n):
        retVal = 1
        while n > 0:
            if (n & 1):
                retVal *= base
            n >>= 1
            base *= base
        return retVal


# Example test case
solver = Solver()
result = solver.solve(33)
print(result)
```

This Python code includes a translation of the logic from the Java version while following Python's conventions and features such as dictionaries and default integer division without the need for explicit typing. The `FastScanner` class is not necessary in Python since reading from the standard input is straightforward with the built-in `input()` function. However, in the code above, I've abstracted the I/O handling by directly passing the test input `33` to the `solve` method, as Python programming practices typically avoid reading user input inside class methods.
