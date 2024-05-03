Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    res = a
    
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    
    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result, and prints it. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `%` operator is used for the modulus operation, which is equivalent to `%` in Java. The `map` function is used to convert the input string into a list of integers. The `input` function is used to read a line of input from the user. The `split` function is used to split the input string into a list of words, and the `int` function is used to convert each word into an integer. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
