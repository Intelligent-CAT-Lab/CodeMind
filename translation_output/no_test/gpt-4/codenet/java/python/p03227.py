Here is the equivalent Python code for the provided Java snippet:

```python
def p03227():
    a = input()
    b = list(a)
    c = len(a)

    if c == 3:
        b[0], b[2] = b[2], b[0]

    for i in range(c):
        print(b[i], end='')

# Execute the function if this is the main module
if __name__ == "__main__":
    p03227()
```

This code takes a string input from the user, reverses it if its length is 3, and then prints the characters of the string. Note that in Python, there is no need to import a Scanner or create a class for this simple task, and it is typical to define a function or just write the code directly in the main block. Also, printing without a newline is done by passing `end=''` to the `print` function in Python.
