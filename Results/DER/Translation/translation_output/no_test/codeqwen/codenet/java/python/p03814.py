Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    s = input()
    n = len(s)

    from_index = 0
    to_index = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_index = i
            break

    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_index = i
            break

    print(to_index - from_index + 1)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads a string from the user, finds the index of the first 'A' and the last 'Z' in the string, and then prints the difference between these two indices plus one. The `if __name__ == "__main__":` block is used to call the `solve()` function when the script is run directly.
