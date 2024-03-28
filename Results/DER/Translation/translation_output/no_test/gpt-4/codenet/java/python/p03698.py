Here is the equivalent Python code for the given Java code:

```python
import sys

def main():
    try:
        input_string = list(input())
        remove_duplication = set(input_string)

        ans = "no"
        if len(input_string) == len(remove_duplication):
            ans = "yes"

        print(ans)

    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(0)

if __name__ == '__main__':
    main()
```

In Python, there's no need to import classes for reading input or handling exceptions at the basic level. The `input()` function is used for getting input from the user, which reads a line from stdin as a string. Error handling is simplified using the `try-except` block. Python's built-in data structures, lists, and sets inherently handle the duplication removal. Note that when getting input from Python's `input()` function, it reads the entire line as a string, so there's no need to split it by commas as in Java's `readLine()`.
