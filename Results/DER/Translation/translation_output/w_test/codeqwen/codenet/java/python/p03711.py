Here is the Python equivalent of the Java code:

```python
def grouped(grp, x, y):
    bx = False
    by = False

    for i in range(len(grp)):
        if grp[i] == x:
            bx = True
        if grp[i] == y:
            by = True

    return bx and by

def main():
    x = int(input())
    y = int(input())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    print("Yes" if (grouped(grp1, x, y) or grouped(grp2, x, y)) else "No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It defines a function `grouped` that checks if two numbers are in a list. It then defines a `main` function that reads two integers from the user, checks if they are in any of the three groups, and prints "Yes" if they are, or "No" if they are not. The `if __name__ == "__main__":` line at the end is a Python idiom that calls the `main` function if the script is run directly (i.e., not imported as a module).
