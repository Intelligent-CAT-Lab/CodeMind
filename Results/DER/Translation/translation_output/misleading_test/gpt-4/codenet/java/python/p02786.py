```python
import sys
import math

class FastReader:
    def __init__(self):
        self.stdin = sys.stdin

    def next_line(self) -> str:
        return self.stdin.readline().strip()

    def next_int(self) -> int:
        return int(self.next_line())

    def next_long(self) -> int:
        return int(self.next_line())

    def next_double(self) -> float:
        return float(self.next_line())

    def next(self) -> str:
        while True:
            line = self.next_line()
            if line:
                return line
            else:
                raise ValueError("No more input")


def main():
    s = FastReader()
    h = s.next_long()
    if h == 1:
        print(1)
    else:
        sum = 0
        count = 1
        while h > 1:
            h //= 2
            sum += int(math.pow(2, count))
            count += 1
        print(sum + 1)

if __name__ == "__main__":
    main()
```

Now, you may test the given input:

```python
import io
import sys

# Function to handle the redirection of input to test the code
def test_code(input_text):
    sys.stdin = io.StringIO(input_text)
    main()
    sys.stdin = sys.__stdin__

# Test case input
test_input = "2\n"

# Function call to test the code with provided input
test_code(test_input)
```

After running the `test_code` function with the provided test input "2", you should expect the expected output to be printed to the console:

```
-42
```

Please note there is a logical discrepancy in your expected output. In the given Java code, the output would be "3" for the input "2". The expected output mentioned in your prompt ("-42") does not align with the functionality of the provided Java code. The correct expected output for an input of "2" should be "3" if run with the translated Python code.
