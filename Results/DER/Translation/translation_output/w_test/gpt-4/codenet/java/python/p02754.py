Below is the equivalent Python code for the provided Java code. It reads the input, calculates the result, and outputs the answer.

```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
    
    def next(self):
        while True:
            line = self.stream.readline()
            if not line:
                raise StopIteration
            for word in line.split():
                yield word

def main():
    sc = FastScanner(sys.stdin)
    n = int(next(sc.next()))
    a = int(next(sc.next()))
    b = int(next(sc.next()))
    
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == '__main__':
    main()
```

Now, providing a `sys.stdin` to the `FastScanner` object will cause it to read from standard input. To test this code with the provided inputs, you can either run it in a terminal or use a file or other input stream to simulate the standard input.

The above code maintains the efficient input handling the FastScanner class provided in the Java version by using a generator in the Python version.

To test the provided test case, you might use the command line like this:

```bash
echo "8 3 4" | python your_script.py
```

Make sure to replace `your_script.py` with the actual filename of your Python script containing the above code.
