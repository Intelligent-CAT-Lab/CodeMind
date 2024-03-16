Below is the translated Java code to Python, and I've placed the solution inside the code block as requested.

```python
# Read the input from the user
n = int(input())

# Printing the number followed by a colon
print(f"{n}:", end="")

# Factorizing the number
i = 2
while i * i <= n:
    if n % i == 0:
        n = n // i
        print(f" {i}", end="")
    else:
        i += 1

# Printing the last factor
print(f" {n}")
```

Sample test case in the Python environment (the input will be provided by the user when prompted):

```
# Test input
12

# Expected output
12: 2 2 3
```
