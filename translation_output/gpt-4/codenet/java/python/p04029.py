Here's the translated code from Java to Python:

```python
# No import needed for taking input in Python

def main():
    sum = 0
    n = int(input())  # Reads an integer from the user
    for i in range(1, n+1):
        sum += i
    print(sum)

if __name__ == "__main__":
    main()
```

In this Python code, we define a main function that includes the logic for calculating the sum of integers from 1 to `n`. We read user input using `input()`, which returns a string, and then convert it to an integer with `int()`. The `for` loop syntax is also slightly different in Python, and we use the built-in `print()` function to output the sum. Moreover, the `if __name__ == "__main__":` guard ensures that `main()` is called only when the script is executed directly, not when imported as a module.
