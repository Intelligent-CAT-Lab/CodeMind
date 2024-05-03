Here is the Python equivalent of the Java code:

```python
def main():
    N, M = map(int, input().split())
    X = 1900 * M + 100 * (N - M)
    rate = 1
    for i in range(1, M+1):
        rate *= 2
    print(rate * X)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the value of X, calculates the value of the rate, and then prints the result. The `map` function is used to convert the input string into a list of integers. The `range` function is used to create a sequence of numbers from 1 to M, which is used to calculate the value of the rate. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
