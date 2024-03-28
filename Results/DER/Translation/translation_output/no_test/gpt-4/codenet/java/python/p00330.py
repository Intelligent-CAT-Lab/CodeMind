Here's the equivalent Python code for the provided Java code:

```python
# Since java.util.Scanner is used for input, we will use Python's input() function

def main():
    W = int(input())  # Read an integer from standard input
    print(W * 32)  # Print the integer multiplied by 32

if __name__ == "__main__":
    main()
```

The `input()` function reads a line from input, converts it to a string, and then the `int()` function converts that string to an integer. Python does not require importing a Scanner like Java does for basic console input.
