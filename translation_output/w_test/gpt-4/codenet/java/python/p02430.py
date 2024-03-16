Here is the Python equivalent of the Java code you provided:

```python
from itertools import combinations

def solve(n, k):
    for combo in combinations(range(n), k):
        print(f"{sum(1<<i for i in combo)}: {' '.join(map(str, combo))}")

# Example test case
if __name__ == "__main__":
    n, k = map(int, input().split())
    solve(n, k)
```

This Python code snippet uses the `combinations` function from the `itertools` module to generate all combinations of size `k` out of `n` indices. The sum `sum(1<<i for i in combo)` calculates the resulting bit pattern for each combination (which would correspond to the `bit` variable in the Java code). It then prints out this sum along with the combination of indices in the desired format.

You can run the example test case by executing the Python script and typing in the input `5 3` as specified.

Please note that the Java code includes a custom `FastScanner` class for fast input parsing, and `Methods` and `p02430` classes to organize methods and the main logic, while the Python translation simplifies this by using built-in functions and treating the problem in a more direct manner, which is common in Python practice.
