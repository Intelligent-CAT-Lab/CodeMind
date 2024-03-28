Below is the equivalent Python code for the Java program you provided:

```python
def atcoder_ABC142_A(N):
    sum = 0
    for i in range(1, N + 1):
        if i % 2 != 0:
            sum += 1
    return sum / N

# Test input
N = 64

# Expected output
print(atcoder_ABC142_A(N))
```

To make it fully functional as a standalone script, you might want to include code that reads an integer input from the user, similar to how the original Java version uses `Scanner`:

```python
def atcoder_ABC142_A(N):
    sum = 0
    for i in range(1, N + 1):
        if i % 2 != 0:
            sum += 1
    return sum / N

# Adding user input functionality
if __name__ == "__main__":
    N = int(input("Enter a number: "))
    print(atcoder_ABC142_A(N))
```

Make sure to execute this script in an environment where Python is installed, and user input can be provided if you're using the user input functionality version.
