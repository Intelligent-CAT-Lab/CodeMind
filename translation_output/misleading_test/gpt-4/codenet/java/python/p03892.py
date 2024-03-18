Below is the Python equivalent of the given Java code:

```python
import sys
import math

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def solve():
    a, b = map(int, input().split())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()
```

The Python code reads four space-separated values from the input which represent the test case provided ("1 1 3 4"). Please note that this code presumes that the inputs are provided sequentially in separate calls to `input()` in accordance with the structure of the Java code.

The functions `lower_bound`, `upper_bound`, `next_permutation`, and the methods for managing the input stream in Java are not included in the Python translation since they are not used for solving the given test input and are not required here. If these functionalities are needed in Python, equivalent utilities can be found in modules such as `bisect` for bounds and itertools for permutations. However, for the sake of the problem at hand, they are unnecessary. Python's standard library covers many functionalities, including I/O operations, with more streamlined approaches.

To test the Python code with the provided test case, you can run the script and input the required values as instructed by the input prompts, which would mimic entering "1 1 3 4" split across four individual input prompts. If the inputs are provided in a single line, the code could be adjusted accordingly to split and parse the values into the required variables.
