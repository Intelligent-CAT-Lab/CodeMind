Below is the Python equivalent code for the given Java program. The Java program reads two floating-point numbers representing electrical resistances and outputs their equivalent resistance when combined in parallel, formatted to ten decimal places.

```python
import sys

class LightScanner:
    def __init__(self, inp):
        self.input = inp
    
    def doubles(self):
        return map(float, self.input.readline().split())

class LightWriter:
    def __init__(self, out):
        self.output = out

    def ans(self, x, n):
        fmt = "{:.{}f}".format(x, n)
        self.output.write(fmt)
    
    def ln(self):
        self.output.write("\n")

    def close(self):
        self.output.close()

class AEquivalentResistance:
    def solve(self, r1, r2):
        light_writer.ans(1 / (1 / r1 + 1 / r2), 10)
        light_writer.ln()

if __name__ == "__main__":
    light_scanner = LightScanner(sys.stdin)
    light_writer = LightWriter(sys.stdout)
    
    r1, r2 = light_scanner.doubles()
    equivalent_resistance = AEquivalentResistance()
    equivalent_resistance.solve(r1, r2)
    
    light_writer.close()
```

To run the test case with the input `2 3`, you would invoke this script with input via the command line or by adding the following code snippet to the end of the script:

```python
# Test case
import io

input_stream = io.StringIO("2 3\n")
sys.stdin = input_stream
```

Remember to remove the test case code before running in a real-world scenario, as it is only meant for simulation purposes.
