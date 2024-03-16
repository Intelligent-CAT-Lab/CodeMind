Here's the Java code translated into Python:

```python
import sys

def main():
    # Taking input from stdin (standard input)
    a, b, c = map(int, input().split())
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            e = i
            break
    # Outputting the result to stdout (standard output)
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)

if __name__ == "__main__":
    main()
```

The original Java code is reading from the standard input and also makes use of a custom `Reader` class for input parsing. In the Python code provided, the `input()` function is typically used to read from standard input within Python scripts, which simplifies the input handling significantly.

To use this Python script, you could pipe the input through the command line (assuming the Python function is in a script called `p01751.py`):

```bash
echo "10 10 5" | python p01751.py
```

Or alternatively, just run the script and input manually when prompted:

```bash
python p01751.py
```
Then type the input:
```
10 10 5
```

Please note that the current Python implementation assumes you're using Python 3, which is recommended as Python 2 is officially deprecated.
