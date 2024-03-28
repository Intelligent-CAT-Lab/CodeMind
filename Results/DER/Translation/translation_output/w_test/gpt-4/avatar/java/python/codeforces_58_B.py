Below is the translated Java code to Python:

```python
def print_divisors(n):
    print(n, end=" ")
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=" ")
            m = i

# Test input
n = 733035

# Expected output
print_divisors(n)
```

The original Java code reads the input from the console, while the Python code uses a predefined test input value without reading from the console. If you want the Python code to read the input, you can uncomment the following line and place it before using the `n` variable:

```python
# n = int(input())
```
