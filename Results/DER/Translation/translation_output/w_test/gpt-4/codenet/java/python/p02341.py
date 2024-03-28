Here is the Python equivalent of the provided Java code:

```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

In this Python code, I've eliminated the need for the custom `FastScanner` class used in Java for fast input parsing, as Python's standard input functions (`sys.stdin.readline()`, in this case, for reading a line from standard input) are typically fast enough for competitive programming purposes. Furthermore, Python's built-in functions make splitting and converting the string input into integers a simple task.

You can use the above Python code the same way you'd use the Java code for competitive programming or any similar application. The `main()` function is automatically called when you run the Python script.
