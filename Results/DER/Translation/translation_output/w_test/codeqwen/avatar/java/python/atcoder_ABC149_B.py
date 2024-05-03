Here is the Python equivalent of the Java code:

```python
def main():
    A, B, K = map(int, input().split())
    n = A - K
    
    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", B + K - A)
    else:
        print(n, B)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the value of `n`, and then prints the result based on the conditions specified in the Java code.
