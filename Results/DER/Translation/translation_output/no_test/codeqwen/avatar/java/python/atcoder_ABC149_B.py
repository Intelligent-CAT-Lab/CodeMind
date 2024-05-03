Here is the Python equivalent of the Java code:

```python
def main():
    A = int(input())
    B = int(input())
    K = int(input())
    n = A - K
    
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", A + B - K)
    else:
        print(n, B)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import any libraries like in Java. We can use the built-in `input()` function to get user input. The `int()` function is used to convert the input string to an integer. The `print()` function is used to output the result. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
