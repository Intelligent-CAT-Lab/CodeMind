Below is the translated code from Java to Python:

```python
# No need to import anything for taking input in python

# Python uses snake_case for naming by convention, so I will use p00301 to remain consistent with your Java class name.
def p00301():
    n = int(input())
    a = [0] * 15
    i = 0
    while n > 0:
        a[i] = (n + 1) % 3 - 1
        i += 1
        n = (n - a[i - 1]) // 3

    for j in range(i - 1, -1, -1):
        if a[j] == 0:
            print("0", end='')
        elif a[j] > 0:
            print("+", end='')
        else:
            print("-", end='')

        if j == 0:
            print()

# When the Python file is executed, the following will run the function
if __name__ == "__main__":
    p00301()
```

This code snippet assumes that the user will only enter an integer value when prompted, similar to the behavior in the Java code. Note that the division in Python uses `//` to perform integer division. Python doesn't require explicit array length declaration as Java does, but since the code writes to specific indices in the array, we still need to predefine the size of the list `a`. Python uses `if __name__ == "__main__":` to ensure that the code block is only executed when the script is run directly, not when it's imported as a module.
