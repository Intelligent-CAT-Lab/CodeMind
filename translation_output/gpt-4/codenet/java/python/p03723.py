Here is the equivalent Python code for the provided Java code block:

```python
import sys

def main():
    A, B, C = map(int, input().split())

    count = 0

    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:

        if A == B and B == C:
            print(-1)
            return
        
        a, b, c = A, B, C
        
        A = (b + c) // 2
        B = (a + c) // 2
        C = (a + b) // 2

        count += 1

    print(count)

if __name__ == '__main__':
    main()
```

Note the following differences between Java and Python code:

- Import statements: Python doesn't need an import for basic IO operations.
- There's no class definition required in Python; you can define functions directly.
- Python `print` function replaces `PrintWriter`.
- `BufferedReader` and `StringTokenizer` are not needed in Python. We use `input()` for reading input and `split()` to tokenize the input string.
- In Python, `map` is used to apply the `int` function to each of the space-separated input values.
- Python's `int` division operator `//` ensures that the result is an integer, similar to how division operates on `long` in Java.
- No need to flush `stdout` in Python after each print, as `print` will handle that unless you specify otherwise.
- `sys` module is imported but not used, as there's no need to replace the standard output stream like there is in the Java code.
