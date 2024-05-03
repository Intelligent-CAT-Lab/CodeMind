Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    if a == 1:
        if b != 1:
            print("Alice")
    elif b == 1:
        if a != 1:
            print("Bob")
    elif a > b and a != 1 and b != 1:
        print("Alice")
    elif a < b and a != 1 and b != 1:
        print("Bob")
    else:
        print("Draw")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks the conditions, and prints the result. The `map` function is used to convert the input string into a list of integers. The `input().split()` function is used to split the input string into a list of strings, and then `map(int, ...)` is used to convert each string in the list to an integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
