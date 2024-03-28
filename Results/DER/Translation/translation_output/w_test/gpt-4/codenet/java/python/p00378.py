Below is the translated Python code for the Java code provided:

```python
def solve():
    # Reading input values
    A, B, X = map(int, input().split())

    # Rounding X up to the nearest 500 if it's not already a multiple of 500
    if X % 500 != 0:
        X += 500 - X % 500

    # Initializing variables for the case differentiation
    a = 0
    b = 0

    # Different cases as per the conditions given in Java code
    if A < B:
        a = X // 1000 + (1 if X % 1000 > 0 else 0)
    elif A > 2 * B:
        b = X // 500
    else:
        a = X // 1000
        X %= 1000
        b = X // 500

    # Printing the final result
    print(A * a + B * b)

# Calling the solve function if it is the main module
if __name__ == "__main__":
    solve()
```

To run the test case provided (with the expected output of 460), you can use this Python script. You would input "180 100 2400" and it should print "460" as the result.
