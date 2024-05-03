Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())
    res = a
    
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    
    print(res)

if __name__ == "__main__":
    main()
```

In Python, we use the `//` operator for integer division, which is equivalent to `/` in Java. The `%` operator is used for finding the remainder of the division. The `input()` function is used to take user input, and `int()` is used to convert the input to an integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
