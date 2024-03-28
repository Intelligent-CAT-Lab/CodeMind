Below is the translated code from Java to Python. The solution uses `sys.stdin.readline()` to read the input, which is equivalent to `BufferedReader` in Java for reading from the standard input stream.

```python
import sys

def main():
    in_str = sys.stdin.readline()
    a, b, c = map(int, in_str.split())

    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

To test this code with an input of `1 3 8`, you would run the Python script and provide the input either through a file, a pipe, or directly typing it into the console, depending on your testing setup. Ensure standard input is provided; in a script, this can be mocked or replaced for automated testing purposes.
