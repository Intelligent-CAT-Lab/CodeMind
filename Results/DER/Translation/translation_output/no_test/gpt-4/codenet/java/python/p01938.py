Here is the Java code translated to Python:

```python
import re

def main():
    list_input = input()  # Reading input as a string
    a = 'A'
    sum = 0
    for char in list_input:
        if char <= a:
            sum += 1
        a = char
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code removes the need for the `re` (regular expressions) library, which was not used in the original Java code. The Python code reads a string from the standard input (similar to the `BufferedReader` in Java), iterates over the characters in that string, and applies the same conditional logic as the Java code to increment the sum. We then print the resulting sum to the standard output.
