Below is the translated Python code:

```python
import sys

class ACircle:
    def solve(self, testNumber):
        r = int(input())
        print(r * r)

if __name__ == "__main__":
    solver = ACircle()
    solver.solve(1)

# Sample Test
sys.stdin = io.StringIO('2')
# Expected output: -87
```

The provided Java code includes classes for input and output handling. In Python, input handling can be more straightforward using the built-in `input()` function for reading from standard input. The `print()` function can be used to write to standard output.

Please keep in mind that in Python, there is no need to manage input and output streams as meticulously as in Java. The above translation assumes that the input will be given directly, either from standard input during execution or via redirection from a file or another stream.

The "main" method is translated to an `if __name__ == "__main__":` block, which is the Pythonic way to define the entry point of the program.

In the sample test provided in the Python code, I used `io.StringIO` to mimic the standard input for a test case. You will need to uncomment and import the `io` module if you wish to use this approach.

Note that I have removed some of the structure that is not necessary in Python, such as the output writer, since Python's print() function handles this for us. Python functions also do not need an explicit return type or parameter types as in Java.

Additionally, please note that the expected output for the given input '2' would actually be '4', since the code prints the square of the given integer. The '-87' in the original expected output description seems to be a mistake.
