Here is the Python version of the provided Java code:

```python
import sys

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the answer, and prints it to the standard output. The `solve` function is the same as the `solve` function in the Java code. The `if __name__ == "__main__":` block is used to call the `solve` function when the script is run directly.
