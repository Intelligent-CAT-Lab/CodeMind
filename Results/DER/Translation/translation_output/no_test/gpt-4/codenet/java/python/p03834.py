Here's the provided Java code translated into Python:

```python
import sys

def main():
    try:
        line = sys.stdin.readline().rstrip()
        print(line.replace(",", " "))
    except Exception as e:
        print(f"An error occurred: {e}")

if __name__ == "__main__":
    main()
``` 

In this Python version, we use `sys.stdin.readline()` to read a line of input from the standard input (by default, this is the console, just like `System.in` in Java). The `rstrip()` method is used to remove any trailing newline character that `readline()` might include. The `replace()` method in Python works essentially in the same way as in Java, replacing occurrences of the first argument with the second argument within the string.
