Here's the equivalent Python code for the Java code provided:

```python
def main():
    s = input()
    res = 0
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        res = 3
    elif s[0] == 'R' and s[1] == 'R':
        res = 2
    elif s[1] == 'R' and s[2] == 'R':
        res = 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        res = 0
    else:
        res = 1
    
    print(res)

if __name__ == '__main__':
    main()
```

This Python code performs the same logic as the Java code. It reads a line from the standard input, checks different conditions based on the characters of the input string, assigns a value to the `res` variable accordingly, and finally prints the result to standard output. Python does not need to explicitly import libraries for basic I/O operations in this case, as reading from standard input and writing to standard output is built into the language. Please note that error handling and closing the input and output streams are not required in Python for such a simple script.
