The Java code you provided is for calculating the equivalent resistance when two resistors are connected in parallel. Below is the Python version of the same functionality:

```python
import sys

class EquivalentResistance:
    def solve(self, r1, r2):
        result = 1 / (1 / r1 + 1 / r2)
        return result

class LightScanner:
    def doubles(self, input_str):
        return map(float, input_str.split())

if __name__ == "__main__":
    # Assuming input from standard input (stdin)
    scanner = LightScanner()
    r1, r2 = scanner.doubles(input())
    
    solver = EquivalentResistance()
    answer = solver.solve(r1, r2)
    
    # Print the formatted answer with 10 decimal places
    # To match Java's default rounding behavior, Python's round function is used
    print(round(answer, 10))
```

The sample test case for the provided Python code could look like this:

```shell
echo "2 3" | python3 your_python_script.py
```

The expected output should match the given one, which is `-96.96345913705633`. However, please notice that the provided Java code computes a formatted result with precision up to 10 decimal places after the decimal point, whereas the original output value provided does not seem to match the expected operations with given test inputs for calculating resistance in parallel (nor does it even seem to be a possible result for two positive resistances in parallel). Please ensure you provide the correct expected output value for a consistency check.

Here's the Python code modified to use command-line input, which may be closer to your test case:

```python
import sys

def solve(r1, r2):
    return round(1 / (1 / r1 + 1 / r2), 10)

if __name__ == "__main__":
    # Assuming input from command line arguments
    input_str = ' '.join(sys.argv[1:])
    r1, r2 = map(float, input_str.split())
    print(solve(r1, r2))
```

You would then call this script from the command line like so:

```shell
python3 your_python_script.py 2 3
```

The expected output should be formatted to ten decimal places, which in the case of the correct calculation of two resistances in parallel should not be a negative number nor the one provided. If you meant negative output, there might be a mistake as both resistances in parallel should not yield a negative value.
