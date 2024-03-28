Below is the translated Python code that matches the logic of the provided Java code, using Python's built-in functionality for reading input data.

```python
def main():
    n, m = map(int, input().split())  # Reading n and m from the input
    output = []

    # The condition (n % 2 == 0) and its else part contain the same logic, so we can use one block for both.
    output.append(0)  # The first element is always zero

    for _ in range(1, n // 2 + 1):
        output.append(0)  # First half zeros

    for _ in range(n // 2 + 1, n):
        output.append(m)  # Second half m's

    print(*output)  # Unpacking the list to print space-separated values

if __name__ == "__main__":
    main()
```

Please note that in Python, it is not necessary to write custom classes for fast input as the built-in `input()` function is typically sufficient for competitive programming unless very high performance is required. For such cases, one may use `sys.stdin.readline()` which is faster than `input()`. In the Java code, the `FastScanner` class was used for efficient input reading, which is more relevant in Java due to its generally slower standard input reading mechanisms. 

Here is how you might use the Python solution:
```
# Sample Input:
# 3 100

# Expected Output:
# 0 0 100
```

Just run the Python code and provide the input accordingly, and it will give you the expected output.
